package com.oracle.lock.lock;
public class LockTest {

    public static void main(String[] args) throws InterruptedException {

        final BooleanLock booleanLock = new BooleanLock();

        //创建4个线程
        for (int i = 1; i < 5; i++) {

            new Thread("T" + i) {
                @Override
                public void run() {
                    try {
                        booleanLock.lock(10000);
                        System.out.println(Thread.currentThread().getName() + " have the lock Monitor");
                        work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (Lock.TimeOutException e) {
                        System.out.println(Thread.currentThread().getName() + " time out");
                    } finally {
                        booleanLock.unlock();
                    }
                };
            }.start();
        }

    }

    private static void work() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " is Working...");
        Thread.sleep(40_000);
    }
}

