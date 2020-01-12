package com.dotry.zone.proxy.demo1;

public class Client {
    public static void main(String[] args) {
//        Host host = new Host();
//        host.rent();
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
