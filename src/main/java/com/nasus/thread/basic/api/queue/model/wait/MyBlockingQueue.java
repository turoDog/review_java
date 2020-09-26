package com.nasus.thread.basic.api.queue.model.wait;

import java.util.LinkedList;
import java.util.Random;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.thread.basic.api.queue.model <br/>
 * Date:2020/9/14 23:51 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyBlockingQueue {

    private int maxSize;
    private LinkedList<Integer> queue;

    public MyBlockingQueue(int size) {
        this.maxSize = size;
        queue = new LinkedList<>();
    }

    public synchronized void put() throws InterruptedException {
        while (queue.size() == maxSize) {
            System.out.println("队列已满，生产者: " + Thread.currentThread().getName() +"进入等待");
            wait();
        }
        Random random = new Random();
        int i = random.nextInt();
        System.out.println("队列未满，生产者: " +
                Thread.currentThread().getName() +"放入数据" + i);

        // 队列空才去唤醒消费者，其他时间自由竞争锁
        if (queue.size() == 0) {
            notifyAll();
        }

        queue.add(i);
    }

    public synchronized void take() throws InterruptedException {
        while (queue.size() == 0) {
            System.out.println("队列为空，消费者: " + Thread.currentThread().getName() +"进入等待");
            wait();
        }

        // 队列满了才去唤醒生产者，其他时间自由竞争锁
        if (queue.size() == maxSize) {
            notifyAll();
        }

        System.out.println("队列有数据，消费者: " +
                Thread.currentThread().getName() +"取出数据: " + queue.remove());
    }

}
