package com.nasus.thread.basic.api;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.thread.basic.api <br/>
 * Date:2020/8/30 19:13 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class TestMain {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        DaemonThread  daemonThread = new DaemonThread();

        //带参构造方法给线程起名字
        Thread thread1 = new Thread(myThread, "一个优秀的废人");
        Thread thread2 = new Thread(daemonThread, "在复习多线程");

        // 设置 thread2 为守护线程
        thread2.setDaemon(true);

        // 启动线程
        thread1.start();
        thread2.start();

        // 打印当前线程的名字
        System.out.println(Thread.currentThread().getName());
    }

}
