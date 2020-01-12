package com.dotry.zone.proxy.demo2;



public class Client {
    public static void main(String[] args) {
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        Host host = new Host();
        proxyInvocationHandler.setRent(host);
        Rent rent = (Rent) proxyInvocationHandler.getProxy();
        Play play = (Play) proxyInvocationHandler.getProxy();
        rent.rent();
        play.play();
    }
}
