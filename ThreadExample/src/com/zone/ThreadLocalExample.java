package com.zone;

public class ThreadLocalExample {

    // jdk建议将 ThreadLocal 定义为 private static ，这样就不会有弱引用，内存泄漏的问题了
    private static ThreadLocal<String> nameTh = new ThreadLocal<String>();

    public String get(){
        return nameTh.get();
    }

    public void set(String name){
        this.nameTh.set(name);
    }

    public static void main(String[] args) {
        final ThreadLocalExample th = new ThreadLocalExample();

        th.set("主线程 main...");

        new Thread(()->{
            th.set("lcm");
            System.out.println(Thread.currentThread().getName()+"--"+ th.get() );
        }).start();


        new Thread(()->{
            th.set("zzq");
            System.out.println(Thread.currentThread().getName()+"--"+ th.get() );
        }).start();

        System.out.println(Thread.currentThread().getName()+"--"+ th.get() );
    }

}