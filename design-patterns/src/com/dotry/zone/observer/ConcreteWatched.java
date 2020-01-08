package com.dotry.zone.observer;

import java.util.ArrayList;

public class ConcreteWatched implements Watched{
    ArrayList<Watcher> watchers = new ArrayList<>();
    @Override
    public void addWathcer(Watcher watcher) {
        watchers.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher) {
        watchers.remove(watcher);
    }

    @Override
    public void notifyWathcer(String string) {
        for (Watcher watcher:watchers){
            watcher.update(string);
        }
    }
}
