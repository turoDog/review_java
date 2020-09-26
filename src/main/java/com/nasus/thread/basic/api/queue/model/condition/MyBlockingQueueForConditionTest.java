package com.nasus.thread.basic.api.queue.model.condition;

/**
 * Project Name:review_java <br/>
 * Package Name:com.nasus.thread.basic.api.queue.model.condition <br/>
 * Date:2020/9/21 17:40 <br/>
 *
 * @author <a href="turodog@foxmail.com">chenzy</a><br/>
 */
public class MyBlockingQueueForConditionTest {

    public static void main(String[] args) {
        MyBlockingQueueForCondition myBlockingQueueForCondition = new MyBlockingQueueForCondition(10);
        ProducerForCondition producerForCondition = new ProducerForCondition(myBlockingQueueForCondition);
        ConsumerForCondition consumerForCondition = new ConsumerForCondition(myBlockingQueueForCondition);
        new Thread(producerForCondition).start();
        new Thread(consumerForCondition).start();
    }

}
