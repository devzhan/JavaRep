package com.oracle.lock.pc;

/**
 * 生产者线程
 * @author lixiaoxi
 *
 */
public class MyThreadConsume implements Runnable{

    private PCService service;

    public MyThreadConsume(PCService service) {
        this.service = service;
    }

    @Override
    public void run() {
        for (;;) {
            service.consume();
        }
    }

}
