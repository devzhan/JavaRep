package com.oracle.lock;

import java.util.concurrent.locks.ReentrantLock;

public class LockRunnable implements Runnable{

    ReentrantLock reentrantLock = new ReentrantLock();
    @Override
    public void run() {
        try {

            reentrantLock.lock();
            for (int i=0 ;i<3;i++){
                System.out.println(Thread.currentThread().getName()+"======="+i);
            }
        }finally {
            reentrantLock.unlock();
        }
    }
}
