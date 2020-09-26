package com.nasus.thread.basic.first;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.thread.coooperation.basic.first <br/>
 * Date:2020/8/16 15:49 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("通过集成 Thread 类实现线程");
    }

}
