package com.nasus.thread.basic.api;

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
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new StopThread());
        thread.start();
        Thread.sleep(5);
        thread.interrupt();
    }
}
