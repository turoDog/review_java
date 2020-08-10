package com.nasus.thread.coooperation.condition;

import java.util.LinkedList;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.thread.coooperation <br/>
 * Date:2020/8/10 18:36 <br/>
 *
 * @author <a href="mailto:chenzy01@eastcom-sw.com">chenzy</a><br/>
 */
public class MyBlockingQueueForWaitNotify {

    private int maxSize;
    private LinkedList< Object > storage;

    public MyBlockingQueueForWaitNotify(int size) {
        this.maxSize = size;
        storage = new LinkedList < > ();
    }

    public synchronized void put() throws InterruptedException {
        while (storage.size() == maxSize) {
            // 当前线程等待，并释放锁
            this.wait();
        }
        storage.add(new Object());
        // 唤醒其他线程
        this.notifyAll();
    }

    public synchronized void take() throws InterruptedException {
        while (storage.size() == 0) {
            // 当前线程等待，并释放锁
            this.wait();
        }
        System.out.println(storage.remove());
        // 唤醒其他线程
        this.notifyAll();
    }

}
