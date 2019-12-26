package com.oracle;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

public class MyThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread td = new Thread(r);
        td.setName("myfactory-" + td.getId());
        td.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                //自定义异常捕获机制..
                System.out.println("thread execute error");
            }
        });

        return td;
    }
}
