package com.nasus.thread.basic.first;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.thread.basic.first <br/>
 * Date:2020/8/16 15:52 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyThreadFactory implements ThreadFactory {

    // 线程池序号
    static final AtomicInteger poolNumber = new AtomicInteger(1);
    // 线程序号
    final AtomicInteger threadNumber = new AtomicInteger(1);
    // 线程组
    final ThreadGroup group;
    // 线程池前缀
    final String namePrefix;

    MyThreadFactory() {
        SecurityManager s = System.getSecurityManager();
        group = (s != null) ? s.getThreadGroup() :
                Thread.currentThread().getThreadGroup();
        namePrefix = "pool-" +
                poolNumber.getAndIncrement() +
                "-thread-";
    }

    /**
     * 重点方法
     * @param r
     * @return
     */
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(group, r,
                namePrefix + threadNumber.getAndIncrement(),
                0);
        // 是否是守护线程
        if (t.isDaemon()) {
            t.setDaemon(false);
        }
        // 设置优先级
        if (t.getPriority() != Thread.NORM_PRIORITY) {
            t.setPriority(Thread.NORM_PRIORITY);
        }
        return t;
    }

}
