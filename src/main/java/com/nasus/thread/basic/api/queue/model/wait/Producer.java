package com.nasus.thread.basic.api.queue.model.wait;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.thread.basic.api.queue.model.wait <br/>
 * Date:2020/9/21 14:58 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class Producer implements Runnable {

    private MyBlockingQueue myBlockingQueue;

    public Producer(MyBlockingQueue myBlockingQueue) {
        this.myBlockingQueue = myBlockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                myBlockingQueue.put();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
