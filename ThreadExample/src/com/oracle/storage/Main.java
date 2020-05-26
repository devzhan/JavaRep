package com.oracle.storage;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        Producer producer1 = new Producer(new ImpFactory(linkedList),80);
        Producer producer2= new Producer(new ImpFactory(linkedList),20);

        Producer producer3= new Producer(new ImpFactory(linkedList),30);

        Producer producer4= new Producer(new ImpFactory(linkedList),40);

        Consumer consumer = new Consumer(new ImpFactory(linkedList),30);
//        producer1.start();
//        producer2.start();
//        producer3.start();
//        producer4.start();
//
//        consumer.start();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1=======");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    t1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println("t2========="+System.currentTimeMillis());
            }
        });

//
//        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main======="+System.currentTimeMillis());

    }


    static class  Producer extends Thread{
        int number;
        ImpFactory impFactory ;
        public Producer(ImpFactory abstractStorage,int number){
            impFactory = abstractStorage;
            this.number = number;
        }

        @Override
        public void run() {
            impFactory.produce(number);
        }

    }

    static class  Consumer extends Thread{
        int number;
        ImpFactory impFactory ;
        public Consumer(ImpFactory abstractStorage,int number){
            impFactory = abstractStorage;
            this.number = number;
        }

        @Override
        public void run() {
            impFactory.consume(number);
        }

    }


}
