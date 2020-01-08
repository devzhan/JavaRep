package com.dotry.zone.observer;

public class Main {
    public static void main(String[] args) {
        Watched watched = new ConcreteWatched();
        Watcher watcher1 = new ConcreteWatcher();
        Watcher watcher2 = new ConcreteWatcher();
        Watcher watcher3 = new ConcreteWatcher();
        watched.addWathcer(watcher1);
        watched.addWathcer(watcher2);
        watched.addWathcer(watcher3);
        watched.notifyWathcer("我开始行动了 ");


    }
}
