package com.nasus.lambda.how;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.lambda.how <br/>
 * Date:2020/1/1 14:40 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Method {

    private String name;

    // 静态方法
    public static void StaticMethod(String name) {
        System.out.println(name);
    }

    // 实例方法
    public void InstanceMethod(String name) {
        System.out.println(name);
    }

    // 无参构造方法
    public Method() {
    }

    // 有参数构造
    public Method(String methodName) {
        this.name = methodName;
    }

    @Override
    public String toString() {
        return "Method{" +
                "name='" + name + '\'' +
                '}';
    }
}
