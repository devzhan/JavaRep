package com.oracle.selected;

import com.oracle.bubble.Bubble;

import java.util.Arrays;

public class SelectedTest {
    public static void main(String[] args) {
        Integer[] arr= new Integer[]{4,5,6,3,2,1};
        Selected.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
