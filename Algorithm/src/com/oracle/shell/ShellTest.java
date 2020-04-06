package com.oracle.shell;

import java.util.Arrays;

public class ShellTest {
    public static void main(String[] args) {
        Integer[] arr= new Integer[]{4,5,6,3,2,1};
        Shell.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
