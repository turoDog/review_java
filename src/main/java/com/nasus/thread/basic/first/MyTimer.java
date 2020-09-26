package com.nasus.thread.basic.first;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.thread.basic.first <br/>
 * Date:2020/8/16 18:32 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyTimer {

    public static void main(String[] args) {
        timer();
    }

    /**
     * 指定时间 time 执行 schedule(TimerTask task, Date time)
     */
    public static void timer() {
        Timer timer = new Timer();
        // 设定指定的时间time,此处为2000毫秒
        timer.schedule(new TimerTask() {
            public void run() {
                System.out.println("执行定时任务");
            }
        }, 2000);
    }

}
