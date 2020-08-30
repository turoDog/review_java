package com.nasus.thread.basic.api;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.thread.basic.api <br/>
 * Date:2020/8/30 23:56 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class StopDuringSleep implements Runnable {

    @Override
    public void run() {
        int count = 0;
        try {
            while (!Thread.currentThread().isInterrupted() && count < 1000) {
                System.out.println("count = " + count++);
                Thread.sleep(1000000);
            }
        } catch (InterruptedException e) {
            // 判断该线程的中断标志位状态
            System.out.println(Thread.currentThread().isInterrupted());
            // 打印线程状态
            System.out.println(Thread.currentThread().getState());
            // 再次中断
            Thread.currentThread().interrupt();
            // 再次判断该线程的中断标志位状态
            System.out.println(Thread.currentThread().isInterrupted());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new StopDuringSleep());
        thread.start();
        Thread.sleep(5);
        thread.interrupt();
    }

}
