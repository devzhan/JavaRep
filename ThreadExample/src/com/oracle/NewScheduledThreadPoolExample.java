package com.oracle;

import java.sql.Time;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 它接收SchduledFutureTask类型的任务，有两种提交任务的方式：scheduledAtFixedRate和scheduledWithFixedDelaySchduled
 * FutureTask接收的参数：time：任务开始的时间sequenceNumber：任务的序号period：
 * 任务执行的时间间隔它采用DelayQueue存储等待的任务DelayQueue内部封装了一个PriorityQueue，
 * 它会根据time的先后时间排序，若time相同则根据sequenceNumber排序；DelayQueue也是一个无界队列；
 * 工作线程的执行过程：工作线程会从DelayQueue取已经到期的任务去执行；执行结束后重新设置任务的到期时间，再次放回DelayQueue
 *
 */
public class NewScheduledThreadPoolExample {
    public static void main(String[] args) {
        int coreSize = Runtime.getRuntime().availableProcessors();
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);
        for (int i= 0 ;i<10;i++){
            int index = i;
            executorService.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    System.out.println("currentTime is :"+System.currentTimeMillis()+"---index is :"+index);

                 }
            },1,3, TimeUnit.SECONDS);

//            executorService.scheduleWithFixedDelay()
        }

    }
}
