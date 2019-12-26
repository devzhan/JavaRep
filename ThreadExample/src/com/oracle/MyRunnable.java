package com.oracle;


public class MyRunnable implements Runnable {

    public MyRunnable(String name) {
        this.myname = name;
    }

    private String myname;

    public String getMyname() {
        return myname;
    }

    public void setMyname(String myname) {
        this.myname = myname;
    }

    @Override
    public void run() {
        System.out.println("myname is :" + myname);
        try {
            Thread.sleep(5 * 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}