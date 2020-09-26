package com.nasus.thread.basic.first;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.thread.basic.first <br/>
 * Date:2020/8/16 16:28 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class TestMain {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setPriority(10);
        myThread.start();

        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }

}
