package com.nasus.proxy.statics;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.proxy <br/>
 * Date:2019/5/12 13:49 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Me implements Human{

    @Override
    public void eat() {
        System.out.println("eat emat ....");
    }

    @Override
    public void sleep() {
        System.out.println("Go to bed at one o'clock in the morning");
    }

    @Override
    public void lookConcert() {
        System.out.println("I watch the Jacky Cheung's Concert");
    }

}
