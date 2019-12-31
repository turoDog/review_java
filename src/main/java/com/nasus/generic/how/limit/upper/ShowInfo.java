package com.nasus.generic.how.limit.upper;

import com.nasus.generic.how.limit.Info;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.generic.how.limit.upper <br/>
 * Date:2019/12/28 23:23 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ShowInfo {

    // 用在方法上，只能接收 Number 及其子类
    public static void showInfo(Info<? extends Number> t) {
        System.out.print(t);
    }

    public static void main(String args[]) {
        Info<Integer> i1 = new Info<>();
        Info<Float> i2 = new Info<>();
        i1.setVar(666666666);
        i2.setVar(666666.66f);
        showInfo(i1);
        showInfo(i2);
    }

}
