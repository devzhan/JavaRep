package com.oracle.lock.pc;


public class Main {

    public static void main(String[] args) {
        PCService service = new PCService();
        Runnable produce = new MyThreadProduce(service);
        Runnable consume = new MyThreadConsume(service);
        new Thread(produce, "生产者  ").start();
        new Thread(consume, "消费者  ").start();
    }
}