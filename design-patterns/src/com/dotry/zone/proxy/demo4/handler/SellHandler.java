package com.dotry.zone.proxy.demo4.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SellHandler implements InvocationHandler {
    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    private  Object target = null;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res =null;
        res =method.invoke(target,args);
        if (res!=null){
            Float prices = (Float) res;
            prices = prices+20;
            res = prices;
        }
        System.out.println("res==="+res);


        return res;
    }
}
