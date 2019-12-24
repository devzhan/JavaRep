package com.oracle;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 它只会创建一条工作线程处理任务；
 * 采用的阻塞队列为LinkedBlockingQueue
 */
public class NewSingleThreadExecutorExample {
    public static void main(String[] args) {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            singleThreadExecutor.execute(new Runnable() {

                @Override
                public void run() {
                    try {
                        System.out.println("currentTime is :" + System.currentTimeMillis() + "---index is :" + index);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            });
        }
    }


}
