package com.oracle;



import java.util.concurrent.*;

public class CustomThreadPool {
    private static final int CORE_POOL_SIZE = 1;
    private static final int MAX_POOL_SIZE = 1;
    private static final int KEEP_ALIVE_TIME = 30;
    public static void main(String[] args) {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, KEEP_ALIVE_TIME,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<Runnable>(2), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                //线程创建的次数同核心线程数，最大线程数，任务数有关系
                Thread thread = new Thread(r);
                System.out.println("newThread==="+thread.getName());

                return thread;
            }


        }, new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                //线程拒绝之后的策略
                System.out.println("rejectedExecution===="+((MyRunnable)r).Name);

            }
        });
//        ThreadPoolExecutor threadPoolExecutor1 = new ThreadPoolExecutor(CORE_POOL_SIZE,MAX_POOL_SIZE,KEEP_ALIVE_TIME,TimeUnit.SECONDS,new LinkedBlockingDeque<>(2),new ThreadPoolExecutor.AbortPolicy());
        MyRunnable t1 = new MyRunnable("T1");
//        t1.setName("t1");
        MyRunnable t2 = new MyRunnable("T2");
//        t2.setName("t2");
        MyRunnable t3 = new MyRunnable("T3");
//        t3.setName("t3");
        MyRunnable t4 = new MyRunnable("T4");
//        t4.setName("t4");
        MyRunnable t5 = new MyRunnable("T5");
        MyRunnable t6 = new MyRunnable("T6");
        MyRunnable t7 = new MyRunnable("T7");
//        t5.setName("t5");
        // 将线程放入池中进行执行
        threadPoolExecutor.execute(t1);
        threadPoolExecutor.execute(t2);
        threadPoolExecutor.execute(t3);
        threadPoolExecutor.execute(t4);
        threadPoolExecutor.execute(t5);
        threadPoolExecutor.execute(t6);
        threadPoolExecutor.execute(t7);



    }

    static class  MyRunnable implements Runnable {
        public MyRunnable(String name) {
            Name = name;
        }

        public String Name ;
        @Override
        public void run() {
            System.out.println(Name + "正在执行。。。");
        }
    }
}
