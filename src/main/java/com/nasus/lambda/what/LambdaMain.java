package com.nasus.lambda.what;

/**
 * Project Name:review_java <br/>
 * Package Name:main.java.com.nasus.lambda.what <br/>
 * Date:2020/1/1 11:31 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class LambdaMain {

    public static void main(String[] args) {
        //lambda 写法
        new Thread(() -> System.out.println("lambda写法")).start();

        Runnable runnable = () -> System.out.println("lambda写法");
    }

}
