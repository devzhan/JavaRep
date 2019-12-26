package com.oracle;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 拒绝策略
 */
public class RejectedExecutionHandlerImpl implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        MyRunnable my = (MyRunnable)r;
        System.out.println("拒绝执行...:"+my.getMyname());
    }
}
