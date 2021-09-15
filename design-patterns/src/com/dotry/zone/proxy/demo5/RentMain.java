package com.dotry.zone.proxy.demo5;

import com.dotry.zone.proxy.demo4.service.UsbSell;

import java.lang.reflect.Proxy;

public class RentMain {
    public static void main(String[] args) {
        HouseRent houseRent = new BeikeRent();
        RentHandler rentHandler = new RentHandler();
        rentHandler.setHouseRent(houseRent);
        HouseRent proxyInstance = (HouseRent) Proxy.newProxyInstance(houseRent.getClass().getClassLoader(),houseRent.getClass().getInterfaces(),rentHandler);
        proxyInstance.rent();
    }
}
