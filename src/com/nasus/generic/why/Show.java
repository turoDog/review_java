package com.nasus.generic.why;

import java.util.ArrayList;
import java.util.List;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.generic <br/>
 * Date:2019/12/28 20:58 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Show {

    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("一个优秀的废人");
        list.add("java 工程师");
        list.add(666);
        //1.当我们将一个对象放入集合中，集合不会记住此对象的类型，当再次从集合中取出此对象时，改对象的编译类型变成了Object类型，但其运行时类型任然为其本身类型。
        //2.因此，//1处取出集合元素时需要人为的强制类型转化到具体的目标类型，且很容易出现“java.lang.ClassCastException”异常。
        for (int i = 0; i < list.size(); i++) {
            String value= (String) list.get(i);
            System.out.println(value);
        }
    }

}
