package com.oracle.thread;

public class ThreadDemo1 {
    public static void main(String[] args) {
    Thread1 thread1 = new Thread1();
    thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i =1;i<1000;i++){
            System.out.println("主线主线  "+Thread.currentThread().getName()+i);
        }
    }


}
 class Thread1  extends Thread{
    @Override
    public void run() {
        for (int i =1;i<1000;i++){
            System.out.println("线程1"+getName()+i);
        }
    }
}

