package com.oracle.storage;

public interface GoodsFactory {
    /**
     * 生产
     * @param number
     */
    public void produce(int number);

    /**
     * 消费
     * @param number
     */
    public void consume(int number);
}
