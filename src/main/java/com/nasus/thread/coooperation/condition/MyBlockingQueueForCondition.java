package com.nasus.thread.coooperation.condition;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.thread.coooperation <br/>
 * 用 Condition 实现简易版阻塞队列
 * Date:2020/8/10 18:08 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyBlockingQueueForCondition {

    private final Queue queue;
    private int max = 16;
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition notEmpty = lock.newCondition();
    private final Condition notFull = lock.newCondition();

    public MyBlockingQueueForCondition(int size) {
        this.max = size;
        queue = new LinkedList();
    }

    public void put(Object o) throws InterruptedException {
        lock.lock();
        try {
            while (queue.size() == max) {
                // 当前线程等待，并释放锁
                notFull.await();
            }
            queue.add(o);
            // 唤醒其他线程
            notEmpty.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public Object take() throws InterruptedException {
        lock.lock();
        try {
            while (queue.size() == 0) {
                // 当前线程等待，并释放锁
                notEmpty.await();
            }
            Object item = queue.remove();
            // 唤醒其他线程
            notFull.signalAll();
            return item;
        } finally {
            lock.unlock();
        }
    }

}
