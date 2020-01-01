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

    }

}
