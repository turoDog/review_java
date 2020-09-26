package com.nasus.thread.basic.api.queue.model.condition;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.thread.basic.api.queue.model <br/>
 * Date:2020/9/14 23:19 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyBlockingQueueForCondition {

    private Queue<Integer> queue;
    private int max = 10;
    private ReentrantLock lock = new ReentrantLock();
    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();

    public MyBlockingQueueForCondition(int size) {
        this.max = size;
        queue = new LinkedList();
    }

    public void put(Integer i) throws InterruptedException {
        // 加锁
        lock.lock();
        try {
            // 队列满了，进入等待
            while (queue.size() == max) {
                System.out.println("队列已满，生产者: " + Thread.currentThread().getName() + "进入等待");
                notFull.await();
            }

            // 加入数据之前，队列为空？通知消费者，可以消费
            if (queue.size() == 0) {
                notEmpty.signalAll();
            }

            // 否则，继续生产
            queue.add(i);
        } finally {
            // 最后别忘记释放锁
            lock.unlock();
        }
    }

    public Integer take() throws InterruptedException {
        // 加锁
        lock.lock();
        try {
            // 队列无数据，进入等待
            while (queue.size() == 0) {
                System.out.println("队列为空，消费者: " + Thread.currentThread().getName() + "进入等待");
                notEmpty.await();
            }

            // 取出数据之前，队列已满？通知生产者，可以生产
            if (queue.size() == max) {
                notFull.signalAll();
            }

            // 否则，取出
            return queue.remove();
        } finally {
            // 最后别忘记释放锁
            lock.unlock();
        }
    }
}
