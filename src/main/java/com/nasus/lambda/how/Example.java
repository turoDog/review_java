package com.nasus.lambda.how;

import java.util.function.BiPredicate;
import java.util.function.Consumer;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.lambda.how <br/>
 * Date:2020/1/1 13:22 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Example {

    // 定义函数式接口，只能有一个抽象接口，否则会报错
    // 希望在编译期检出报错，请加 @FunctionalInterface 注解
    public interface Hello {
        String hi();
    }

    public interface Hello2 {
        String hei(String hello);
    }

    public interface Hello3 {
        String greet(String hello, String name);
    }

    public static void main(String[] args) {

        // 入参为空
        Hello no_param = () -> "hi, no param";
        Hello no_param2 = () -> {
            return "hi, no param";
        };

        System.out.println(no_param.hi());
        System.out.println(no_param2.hi());

        // 单个参数,一条返回语句,可以省略大括号和 return
        Hello2 param = name -> name;
        Hello2 param2 = name -> {
            return name;
        };

        // 打印
        System.out.println(param.hei("hei, 一个优秀的废人"));
        System.out.println(param2.hei("hei, 一个优秀的废人"));

        // 多个参数
        Hello3 multiple = (String hello, String name) -> hello + " " + name;

        // 一条返回语句，可以省略大括号和 return
        Hello3 multiple2 = (hello, name) -> hello + name;

        // 多条处理语句，需要大括号和 return
        Hello3 multiple3 = (hello, name) -> {
            System.out.println(" 进入内部 ");
            return hello + name;
        };

        // 打印
        System.out.println(multiple.greet("hello,", "祝2020脱单"));
        System.out.println(multiple2.greet("hello,", "祝2020脱单"));
        System.out.println(multiple3.greet("hello,", "祝2020脱单"));

    }

}
