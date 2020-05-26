package com.oracle.storage;

import java.util.LinkedList;

public class ImpFactory implements GoodsFactory {
    private int MAX = 100;//仓库最大容量

    LinkedList<String> linkedList;
    public ImpFactory(LinkedList<String> linkedList) {
        this.linkedList = linkedList;
    }

    @Override
    public void produce(int number) {
        synchronized (linkedList){
            //生产的数量和存储量大于仓库总量，暂停生产
            while (linkedList.size()+number>MAX){
                System.out.println("生产的数量和存储量大于仓库总量，暂停生产");
                try {
                    linkedList.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            for (int i =0;i<number;i++){
                linkedList.add("商品"+i);
            }
            System.out.println("商品生产足够，商品总量为"+linkedList.size());

            linkedList.notifyAll();
        }
    }

    @Override
    public void consume(int number) {
        synchronized (linkedList){
            //生产的数量和存储量大于仓库总量，暂停生产
            while (number>linkedList.size()){
                System.out.println("消耗的数量"+number+"大于仓库总量，请等待生产,仓库总量为:"+linkedList.size());
                try {
                    linkedList.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            for (int i =0;i<number;i++){
                linkedList.remove();
            }
            System.out.println("消耗了商品"+number+"件，商品剩余量为"+linkedList.size());
            linkedList.notifyAll();
        }
    }

}
