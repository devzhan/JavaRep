package com.oracle.lock;

import java.util.Observable;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedTest {

    public static void main(String[] args) {
        SynchronizedTest test = new SynchronizedTest();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                test.method1();
//            }
//        }
//        ).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                test.method2();
//            }
//        }
//        ).start();
        lockMethod();

//        DeadLockThread deadLock1=new DeadLockThread(true);
//        DeadLockThread deadLock2=new DeadLockThread(false);
//        Thread t1=new Thread(deadLock1);
//        Thread t2=new Thread(deadLock2);
//        t1.start();
//        t2.start();

    }
    public void method() {
        synchronized (this) {
            System.out.println("Method 1 start");
        }
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();
    }
    private synchronized void method1(){
        System.out.println("synchroized test method1");

        try {
             System.out.println("Method 1 execute");

            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end method1");
    }

    private  synchronized void  method2(){
        System.out.println("synchroized test method2");
        System.out.println("Method 2 execute");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end method2");
    }


    static void lockMethod(){
        Object object1 = new Object();
        Object object2 = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object1){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                synchronized (object2){
                    System.out.println("object2========="+object2);
                }
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object2){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                synchronized (object1){
                    System.out.println("object1========="+object1);
                }
            }
        }).start();


    }


}
