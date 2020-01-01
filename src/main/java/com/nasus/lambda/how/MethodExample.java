package com.nasus.lambda.how;

import java.util.function.BiPredicate;
import java.util.function.Consumer;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.lambda.how <br/>
 * Date:2020/1/1 14:16 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MethodExample {

    public static void main(String[] args) {

        // 静态方法引用--通过类名调用
        Consumer<String> consumerStatic = Method::StaticMethod;
        consumerStatic.accept("静态方法");
        // 等价于
        Consumer<String> consumerStatic2 = (x) -> Method.StaticMethod(x);
        consumerStatic2.accept("静态方法");

        System.out.println("--------------------------");
        //非静态方法引用--通过实例调用
        Method method = new Method();
        Consumer<String> consumerInstance = method::InstanceMethod;
        consumerInstance.accept("对象的实例方法");
        // 等价于
        Consumer<String> consumerInstance2 = (x) -> method.InstanceMethod(x);
        consumerInstance2.accept("对象的实例方法");

        System.out.println("--------------------------");
        //ClassName::instanceMethod  类的实例方法：把表达式的第一个参数当成 instanceMethod 的调用者，其他参数作为该方法的参数
        BiPredicate<String, String> sbp = String::equals;
        System.out.println("类的实例方法 " + sbp.test("a", "A"));
        // 等效
        BiPredicate<String, String> sbp2 = (x, y) -> x.equals(y);
        System.out.println("类的实例方法 " + sbp2.test("a", "A"));
    }

}
