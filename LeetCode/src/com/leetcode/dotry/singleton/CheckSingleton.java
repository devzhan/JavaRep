package com.leetcode.dotry.singleton;

public class CheckSingleton {
    private  static volatile CheckSingleton INSTACE ;
    private CheckSingleton(){};
    public static CheckSingleton getInstance(){
        if (INSTACE==null){
            synchronized (CheckSingleton.class){
                if (INSTACE ==null){
                    INSTACE = new CheckSingleton();
                }
            }
        }
        return INSTACE;
    }
    
    public static CheckSingleton getSingleton(){
        if (INSTACE ==null){
            synchronized (CheckSingleton.class){
                if (INSTACE==null){
                    INSTACE = new CheckSingleton();
                }
            }
        }
        return INSTACE;
    }
}
