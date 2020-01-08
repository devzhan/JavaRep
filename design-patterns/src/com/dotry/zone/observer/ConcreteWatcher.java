package com.dotry.zone.observer;

public class ConcreteWatcher implements Watcher{
    @Override
    public void update(String string) {
        System.out.println("string is ==="+string);
    }
}
