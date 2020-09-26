package com.nasus.thread.basic.api.interrupt;

import com.sun.deploy.panel.ITreeNode;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.thread.basic.api <br/>
 * Date:2020/8/30 23:39 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class StopThread implements Runnable {

    @Override
    public void run() {
        int count = 0;
        while (!Thread.currentThread().isInterrupted() && count < 1000) {
            System.out.println("count = " + count++);
        }
        System.out.println("响应中断退出线程");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new StopThread());
        thread.start();
        // 查看状态
        System.out.println(thread.getState());
        // 中断
        thread.join();
        thread.interrupt();
        // 查看标志位
        System.out.println(thread.isInterrupted());
        // 等待 thread 中断
        Thread.sleep(500);
        // 查看标志位
        System.out.println(thread.isInterrupted());
        // 查看状态
        System.out.println(thread.getState());

    }
}
