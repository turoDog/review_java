package com.nasus.thread.basic.api.daemon;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.thread.basic.api <br/>
 * Date:2020/8/30 19:14 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThread implements Runnable{

    @Override
    public void run() {
        // 打印当前线程的名字
        System.out.println(Thread.currentThread().getName());
    }

}
