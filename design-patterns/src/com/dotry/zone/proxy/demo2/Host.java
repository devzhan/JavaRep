package com.dotry.zone.proxy.demo2;

public class Host implements Rent,Play {
    @Override
    public void rent() {
        System.out.println("房东出租房子");
    }

    @Override
    public void play() {
        System.out.println("房东play");

    }
}
