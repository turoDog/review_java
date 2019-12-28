package com.nasus.generic.how.limit.upper;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.generic.how.limit <br/>
 * Date:2019/12/28 22:37 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
// 用在类上
public class Show<T extends Number> {

    // 用在方法上
    private T show(T t){
        System.out.println(t);
        return t;
    }

    public static void main(String[] args) {
        // 初始化时指定类型
        Show<Integer> show = new Show<>();
        show.show(6666666);

        // 报错，该类只接受继承于 Number 的泛型参数
        // Show<String> stringShow = new Show<>();
    }
}
