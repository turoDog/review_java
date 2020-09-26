package com.nasus.thread.basic.api.queue.model.condition;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.thread.basic.api.queue.model.wait <br/>
 * Date:2020/9/21 15:48 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class ConsumerForCondition implements Runnable{

    private MyBlockingQueueForCondition myBlockingQueueForCondition;

    public ConsumerForCondition(MyBlockingQueueForCondition myBlockingQueueForCondition) {
        this.myBlockingQueueForCondition = myBlockingQueueForCondition;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("消费者取出数据: " + myBlockingQueueForCondition.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
