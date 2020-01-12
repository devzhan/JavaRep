package com.dotry.zone.proxy.demo1;

public class Proxy implements Rent {
    private Host host;


    public Proxy() {
    }
    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
    }
}
