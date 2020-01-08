package com.dotry.zone.observer;

/**
 * 被观察者
 */
public interface Watched {
    void addWathcer( Watcher watcher);
    void removeWatcher(Watcher watcher);
    void notifyWathcer(String string);
}
