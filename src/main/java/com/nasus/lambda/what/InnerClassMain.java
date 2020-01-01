package com.nasus.lambda.what;

/**
 * Project Name:review_java <br/>
 * Package Name:main.java.com.nasus.lambda.what <br/>
 * Date:2020/1/1 11:31 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class InnerClassMain {
    public static void main(String[] args) {
        //匿名内部类写法
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("内部类写法");
            }
        }).start();
    }
}
