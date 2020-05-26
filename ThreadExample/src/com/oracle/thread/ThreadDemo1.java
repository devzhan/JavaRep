package com.oracle.thread;

public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();
        Thread thread2 = new Thread(new Runnable1());
        thread2.start();

    }

}

class Thread1 extends Thread {
    @Override
    public void run() {
            System.out.println("thread 创建线程---" + getName());
    }
}

class Runnable1 implements Runnable{
    @Override
    public void run() {
        System.out.println("runnable 创建线程---" );
    }
}

