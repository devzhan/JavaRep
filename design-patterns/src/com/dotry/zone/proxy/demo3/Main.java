package com.dotry.zone.proxy.demo3;

public class Main {
    public static void main(String[] args) {
        ImplUserDao implUserDao = new ImplUserDao();
        ProxyUser proxyUser = new ProxyUser(implUserDao);
        proxyUser.work();
        IUserDao target = new ImplUserDao() ;
        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        proxy.work();
    }
}
