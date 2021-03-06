package com.nasus.proxy.dynamic;


/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.proxy.dynamic <br/>
 * Date:2019/5/12 14:41 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("eat Dog food ....");
    }

    @Override
    public void run() {
        System.out.println("Dog running with four legs");
    }

    @Override
    public void seeADoctor() {
        System.out.println("The dog go to the hospital");
    }

}
