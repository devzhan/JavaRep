package com.dotry.zone.proxy.demo4;

import com.dotry.zone.proxy.demo4.factory.UsbKingFactory;
import com.dotry.zone.proxy.demo4.handler.SellHandler;
import com.dotry.zone.proxy.demo4.service.UsbSell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MainShop {
    public static void main(String[] args) {
        UsbSell usbSell = new UsbKingFactory();
        SellHandler handler = new SellHandler();
        handler.setTarget(usbSell);
        UsbSell proxyInstance = (UsbSell) Proxy.newProxyInstance(usbSell.getClass().getClassLoader(),usbSell.getClass().getInterfaces(),handler);
        proxyInstance.sell(1);
        proxyInstance.print();
    }
}

