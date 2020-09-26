package com.nasus.thread.basic.first;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.thread.basic.first <br/>
 * Date:2020/8/16 16:33 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyCallable implements Callable<Integer> {

    //创建线程池
    ExecutorService service = Executors.newFixedThreadPool(10);
    //提交任务，并用 Future提交返回结果
    Future< Integer > future = service.submit(new MyCallable());

    @Override
    public Integer call() throws Exception {
        return new Random().nextInt();
    }
}
