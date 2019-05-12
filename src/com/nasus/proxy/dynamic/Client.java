package com.nasus.proxy.dynamic;

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
        Human human = (Human) huangNiuHandle.getProxyInstance(new Me());

        human.eat();
        human.run();
        human.lookConcert();

        System.out.println("------------------");

        Animal animal = (Animal) huangNiuHandle.getProxyInstance(new Dog());
        animal.eat();
        animal.run();
        animal.seeADoctor();
    }

}
