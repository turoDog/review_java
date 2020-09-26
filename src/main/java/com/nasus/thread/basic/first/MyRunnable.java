package com.nasus.thread.basic.first;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.thread.coooperation.basic.first <br/>
 * Date:2020/8/16 15:48 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("通过实现 Runnable 方式实现线程");
    }

}
