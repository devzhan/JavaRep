package com.oracle.shell;

public class Shell {
    public static void sort(Comparable[] a){
        //确定分组
       int h =1;
       while (h<a.length/2){
           h= 2*h+1;
       }
       while (h>=1){
            for (int i=h ;i<a.length;i++){
                for (int j =i;j>=h;j-=h){
                    //比较a[j] 和 a[j-h]
                    if (grater(a[j-h],a[j])){
                        exch(a,j-h,j);
                    }else {
                        break;
                    }
                }
            }

           //减少h的值
           h = h/2;
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
