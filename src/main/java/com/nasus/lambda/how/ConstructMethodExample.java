package com.nasus.lambda.how;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.lambda.how <br/>
 * Date:2020/1/1 15:53 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ConstructMethodExample {

    public static void main(String [] args) {
        // 构造方法方法引用--无参数(可以使用方法引用)
        Supplier<Method> supplier = Method::new;
        System.out.println(supplier.get());
        // 等价于
        Supplier<Method> supplier2 = () -> new Method();
        System.out.println(supplier2.get());

        // 构造方法方法引用--有参数
        Function<String, Method> uf = name -> new Method(name);
        Method method = uf.apply("一个优秀的废人");
        System.out.println(method.toString());
    }

}
