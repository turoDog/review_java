package com.nasus.proxy.dynamic;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.proxy <br/>
 * Date:2019/5/12 13:49 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Me implements Human {

    @Override
    public void eat() {
        System.out.println("eat meat ....");
    }

    @Override
    public void run() {
        System.out.println("I run with two legs");
    }

    @Override
    public void lookConcert() {
        System.out.println("Listen to Jacky Cheung's Concert");
    }

}
