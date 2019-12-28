package com.nasus.generic.how.inter;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.generic.how.inter <br/>
 * Date:2019/12/28 22:08 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ShowImpl<T> implements Show<T>{

    @Override
    public void show(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        ShowImpl<String> stringShow = new ShowImpl<>();
        stringShow.show("一个优秀的废人");
    }
}
