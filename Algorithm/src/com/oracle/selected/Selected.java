package com.oracle.selected;

public class Selected {
    public static void sort(Comparable[] a){
        for (int i =0;i<=a.length-2;i++){
            //定义默认最小游标
            int minIndex =i;
            for (int j=i+1;j<a.length;j++){
                if (grater(a[minIndex],a[j])){
                    minIndex =j;
                }
            }
            exch(a,i,minIndex);
        }
    }
    private static boolean grater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }
    public static void exch(Comparable[] a,int i,int j){
        Comparable temp;
        temp = a[i];
        a[i]= a[j];
        a[j] = temp;

    }
}
