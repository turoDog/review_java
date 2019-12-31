package com.nasus.generic.how.limit.floor;

import com.nasus.generic.how.limit.Info;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.generic.how.limit.floor <br/>
 * Date:2019/12/28 23:34 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ShowInfo {

    // 只接受 String 的父类
    public static void showInfo(Info<? super String> t) {
        System.out.println(t);
    }

    public static void main(String args[]) {
        Info<String> stringInfo = new Info<>();
        Info<Object> objectInfo = new Info<>();
        stringInfo.setVar("一个优秀的废人");
        objectInfo.setVar(new Object());
        showInfo(stringInfo);
        showInfo(objectInfo);
    }

}
