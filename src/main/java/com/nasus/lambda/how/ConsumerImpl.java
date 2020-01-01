package com.nasus.lambda.how;

import java.util.function.Consumer;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.lambda.how <br/>
 * Date:2020/1/1 15:40 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ConsumerImpl implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }

}
