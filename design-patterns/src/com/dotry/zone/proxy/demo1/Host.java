package com.dotry.zone.proxy.demo1;

import com.dotry.zone.proxy.demo1.Rent;

public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东出租房子");
    }
}
