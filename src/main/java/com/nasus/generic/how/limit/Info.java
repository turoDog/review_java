package com.nasus.generic.how.limit;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.generic.how.limit.upper <br/>
 * Date:2019/12/28 23:22 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Info<T> {

    // 定义泛型变量
    private T var;

    public void setVar(T var) {
        this.var = var;
    }

    public T getVar() {
        return this.var;
    }

    public String toString() {
        return this.var.toString();
    }
}
