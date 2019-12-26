package com.oracle;

public class ThreadCreateDemo2 {
    public static void main(String[] args){
        Thread thread = new Thread(new MyRunnable1());
        thread.start();

    }


}

 class MyRunnable1 implements Runnable{

     @Override
     public void run() {
         System.out.println("my runnable");
     }
 }