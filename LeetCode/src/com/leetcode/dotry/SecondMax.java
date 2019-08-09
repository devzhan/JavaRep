package com.leetcode.dotry;

/**
 * 给出一组数字，查找出数字中第二大的数字
 */
public class SecondMax {
    public static void main(String[] args) {
        int[] nums = new int[]{
                0,1,2,3,4
        };
        int second = getSecondMaxNumber(nums);
        System.out.println("second is----"+second);
    }

    private static int getSecondMaxNumber(int[] array){
        int firstMax = array[0];
        int secondMax = array[0];
        for (int i =0;i<array.length;i++){
            int tempMax;
            if (secondMax>firstMax){
                tempMax = firstMax;
                firstMax = tempMax;
                secondMax = tempMax;
            }
            if (array[i]>firstMax){
                secondMax = firstMax;
                firstMax = array[i];
            }
        }
        return secondMax;
    }
}
