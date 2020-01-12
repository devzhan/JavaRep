package com.oracle.thread;

public class ThreadDemo2 implements Runnable {
    int b = 100;

    public static void main(String[] args) {
        ThreadDemo2 threadDemo2 = new ThreadDemo2();
        Thread thread = new Thread(threadDemo2);
        thread.start();
        threadDemo2.m2();
   }

    @Override
    public void run() {
        m1();
    }

    public synchronized void m1() {

        b = 1000;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m1 b ===" + b);
    }

    public void m2() {
        System.out.println("m2 b ===" + b);
    }

}
