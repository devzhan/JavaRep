package com.dotry.zone.proxy.demo4.factory;

import com.dotry.zone.proxy.demo4.service.UsbSell;

public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        return 85.0f;
    }

    @Override
    public void print() {
        System.out.println("adfgdsf");
    }
}
