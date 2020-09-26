package com.nasus.thread.basic.api.queue.model.blockingqueue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.thread.basic.api.queue.model <br/>
 * Date:2020/9/14 23:08 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ArrayBlockingQueueTest {

    public static void main(String[] args) {
        // 初始化长度为 10 的 ArrayBlockingQueue
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        // 生产者
        Runnable producer = () -> {
            try {
                // 放入数据
                Random random = new Random();
                while (true) {
                    queue.put(random.nextInt());
                }
            } catch (Exception e) {
                System.out.println("生产数据出错: " + e.getMessage());
            }
        };
        // 开启线程生产数据
        new Thread(producer).start();

        // 消费者
        Runnable consumer = () -> {
            try {
                // 取出数据
                while (true) {
                    System.out.println(queue.take());
                }
            } catch (Exception e) {
                System.out.println("消费数据出错: " + e.getMessage());
            }
        };
        // 开启线程消费数据
        new Thread(consumer).start();
    }

}
