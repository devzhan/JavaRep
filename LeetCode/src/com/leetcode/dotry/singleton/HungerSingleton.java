package com.leetcode.dotry.singleton;

public class HungerSingleton {
    private final static HungerSingleton INSTACE = new HungerSingleton();
    private HungerSingleton (){};
    public static HungerSingleton getInstance(){
        return INSTACE;
    }
}
