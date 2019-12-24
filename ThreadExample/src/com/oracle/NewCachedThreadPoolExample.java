package com.oracle;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 它是一个可以无限扩大的线程池；
 * 它比较适合处理执行时间比较小的任务；corePoolSize为0，maximumPoolSize为无限大，意味着线程数量可以无限大；
 * keepAliveTime为60S，意味着线程空闲时间超过60S就会被杀死；
 * 采用SynchronousQueue装等待的任务，这个阻塞队列没有存储空间，这意味着只要有请求到来，
 * 就必须要找到一条工作线程处理他，如果当前没有空闲的线程，那么就会再创建一条新的线程。
 *
 */
public class NewCachedThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i =0;i<10;i++){
            int index = i;
            try {
                Thread.sleep(1000*index);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("currentTime is :"+System.currentTimeMillis()+"---index is :"+index);
                }
            });
        }

    }


}
