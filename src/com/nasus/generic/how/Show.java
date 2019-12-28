package com.nasus.generic.how;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.generic.how <br/>
 * Date:2019/12/28 21:46 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Show {

    public static  <T> T show(T t) {
        System.out.println(t);
        return t;
    }

    public static void main(String[] args) {
        // 返回值不用强转，传进去是什么，返回就是什么
        String s = show("一个优秀的废人");
        int num1 = show(666);
        double num2 = show(666.666);
        System.out.println("------------------------");
        System.out.println(s);
        System.out.println(num1);
        System.out.println(num2);
    }

}
