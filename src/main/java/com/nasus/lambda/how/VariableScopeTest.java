package com.nasus.lambda.how;


/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.lambda.how <br/>
 * Date:2020/1/1 16:09 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class VariableScopeTest {

    // 定义一个接口
    public interface Converter<T1, T2> {
        void convert(int i);
    }

    public static void main(String [] args) {

        // 定义为 final 强制不能修改
        final int num = 1;
        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
        // 输出结果为 3
        s.convert(2);

        // lambda 表达式的局部变量可以不用声明为 final，但是必须不可被后面的代码修改（即隐性的具有 final 的语义）
        // 否则报错
        /*final int num = 1;
        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
        // 输出结果为 3
        s.convert(2);
        num = 10;*/

        // 为什么不能改变？
        // 参考：https://segmentfault.com/a/1190000021168146
        /*int num = 1;
        // 这一步只是声明了 lambda ，并没有执行
        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
        // 假设中途局部变量改变
        num ++;
        // 这时候再执行 lambda ，结果就变了，这就造成数据不同步问题。
        s.convert(2);*/
    }

}
