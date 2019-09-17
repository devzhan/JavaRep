package com.leetcode.dotry;

public class BinarySearch {
    public static void main(String[] args) {

    }

    /**
     * 二分查找
     * @param a
     * @param n
     * @param value
     * @return
     */
    private static int binarySearch(int[] a,int n ,int value){
        int low = 0;
        int high = n-1;
        while (low<high){
            int mind = low+((high-low)>>1);
            if (a[mind]>value){
                high = mind-1;
            }else if (a[mind]<value){
                low = mind+1;
            }else {
                if ((mind==0)||(a[mind-1]!=value)) {
                    return mind;
                }else {
                    high = mind -1;
                }
            }
        }
        return -1;
    }
}
