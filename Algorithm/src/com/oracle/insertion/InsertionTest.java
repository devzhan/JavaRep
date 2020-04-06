package com.oracle.insertion;

import java.util.Arrays;

public class InsertionTest {
    public static void main(String[] args) {
        Integer[] arr= new Integer[]{4,5,6,3,2,1};
        Insertion.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
