package com.oracle;

import sun.awt.windows.ThemeReader;

import java.util.concurrent.*;

/**
 * 它是一种固定大小的线程池；corePoolSize和maximunPoolSize都为用户设定的线程数量nThreads；keepAliveTime为0，
 * 意味着一旦有多余的空闲线程，就会被立即停止掉；但这里keepAliveTime无效；阻塞队列采用了LinkedBlockingQueue，
 * 它是一个无界队列；由于阻塞队列是一个无界队列，因此永远不可能拒绝任务；由于采用了无界队列，实际线程数量将永远维持在nThreads，
 * 因此maximumPoolSize和keepAliveTime将无效。
 *
 */
public class NewFixedThreadPoolExample {
    public static void main(String[] args) {
        int coreSize = Runtime.getRuntime().availableProcessors();
        System.out.println("coreSize is :"+coreSize);
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);
        for (int i =0;i<1;i++){
            int  index =i;
            executorService.execute(new Runnable() {
              @Override
              public void run() {
                  System.out.println("currentTime is :"+System.currentTimeMillis()+"---index is :"+index);
                  try {
                      Thread.sleep(2000);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
          });
        }

    }

}
