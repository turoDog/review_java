package com.nasus.proxy.statics;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.proxy <br/>
 * Date:2019/5/12 13:59 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class HuangNiu implements Human{

    private Me me;

    public HuangNiu() {
        me = new Me();
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void lookConcert() {
        // 添加排队买票方法
        this.lineUp();
        me.lookConcert();
    }

    public void lineUp() {

        System.out.println("line up");

    }

}
