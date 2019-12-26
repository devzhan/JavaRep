package com.oracle;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class MyExecuterPoolsTest {

    public static void main(String[] args) {
        MyExecutorPools ex = new MyExecutorPools(3, 5, 1, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(3),
                new MyThreadFactory(), new RejectedExecutionHandlerImpl());
        for (int i = 0; i < 20; i++) {
            ex.execute(new MyRunnable("n" + i));
        }

    }

}