package com.dotry.zone.proxy.demo3;

public class ProxyUser implements IUserDao {
    private IUserDao iUserDao;

    public ProxyUser(IUserDao iUserDao) {
        this.iUserDao = iUserDao;
    }
    @Override
    public void work() {
        System.out.println("proxy work");
        iUserDao.work();
    }
}
