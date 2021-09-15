package com.dotry.zone.proxy.demo5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RentHandler implements InvocationHandler {
    private HouseRent houseRent;
    public HouseRent getHouseRent() {
        return houseRent;
    }

    public void setHouseRent(HouseRent houseRent) {
        this.houseRent = houseRent;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(houseRent,args);
        return null;
    }
}
