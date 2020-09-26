package com.nasus.thread.basic.api.queue.model.condition;

import com.nasus.thread.basic.api.queue.model.wait.MyBlockingQueue;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.thread.basic.api.queue.model.wait <br/>
 * Date:2020/9/21 14:58 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ProducerForCondition implements Runnable {

    private MyBlockingQueueForCondition myBlockingQueueForCondition;

    public ProducerForCondition(MyBlockingQueueForCondition myBlockingQueueForCondition) {
        this.myBlockingQueueForCondition = myBlockingQueueForCondition;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                myBlockingQueueForCondition.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
