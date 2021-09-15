package com.leetcode.dotry;

import java.util.Iterator;
import java.util.Observable;

public class MyArrayList<T> implements Iterable<T>{
    private static final int DEFAULT_CAPACITY =10;

    public int size() {
        return theSize;
    }

    public void setSize(int theSize) {
        this.theSize = theSize;
    }

    private int theSize;
    private T[] theItems;

    public MyArrayList(){
        doClear();

    }

    private void doClear() {
        theSize = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }

    public void ensureCapacity(int defaultCapacity) {
        if (defaultCapacity<theSize){
            return;
        }
        T [] old = theItems;
        theItems= (T[]) new Object[defaultCapacity];
        for (int i = 0;i<size();i++){
            theItems[i]=old[i];
        }
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private T get(int idx){
        if (idx<0||idx>=size()){
            throw  new ArrayIndexOutOfBoundsException();
        }
        return theItems[idx];
    }

    public T set(int idx ,T newValue){
        if (idx<0||idx>=size()){
            throw  new ArrayIndexOutOfBoundsException();
        }
        T old = theItems[idx];
        theItems[idx]=newValue;
        return old;
    }


}
