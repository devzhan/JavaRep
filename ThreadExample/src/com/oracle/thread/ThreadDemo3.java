package com.oracle.thread;

import sun.awt.windows.ThemeReader;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadDemo3 {
     static boolean flag  ;
//     private synchronized static void stop(){
//         flag= true;
//     }
//     private synchronized static boolean isStop(){
//         return flag;
//     }


    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                long i =0;
                while (!flag){
                    System.out.println("aaa");
                    i++;
                }
            }
        });
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        flag = true;
//        stop();
    }
}
