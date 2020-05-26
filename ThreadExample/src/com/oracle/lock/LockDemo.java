package com.oracle.lock;

import sun.awt.windows.ThemeReader;

import java.util.concurrent.locks.Lock;

public class LockDemo {
    public static void main(String[] args) {
        LockRunnable runnable = new LockRunnable();
        Thread thread1 = new Thread(runnable,"A");
        Thread thread2 = new Thread(runnable,"B");
        thread1.start();
        thread2.start();

    }
}
