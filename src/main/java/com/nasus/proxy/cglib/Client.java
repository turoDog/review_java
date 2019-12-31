package com.nasus.proxy.cglib;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.proxy.statics <br/>
 * Date:2019/5/12 14:05 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Client {

    public static void main(String[] args) {

        HuangNiuHandle huangNiuHandle = new HuangNiuHandle();
        Me me = (Me) huangNiuHandle.getProxyInstance(new Me());

        me.eat();
        me.run();
        me.sleep();
        me.lookConcert();

        System.out.println("------------------");

        Dog dog = (Dog) huangNiuHandle.getProxyInstance(new Dog());
        dog.eat();
        dog.run();
        dog.seeADoctor();

    }

}
