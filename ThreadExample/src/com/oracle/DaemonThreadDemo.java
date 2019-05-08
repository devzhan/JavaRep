package com.oracle;

public class DaemonThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new DaemonThread();
        thread.setDaemon(true);
        thread.start();
        System.out.println("" + Thread.currentThread().getName() + "停止运行!" );
    }
}

class DaemonThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("DaemonThread 正在运行!");
        }
    }
}