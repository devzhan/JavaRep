package com.leetcode.dotry;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 */
public class SumAndTarget01 {


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{
                2, 7, 11, 15
        };
        int target = 18;
      int[] result =   solution.twoSum(nums,target);
      System.out.println("result[0]=="+result[0]);
      System.out.println("result[1]=="+result[1]);
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                result[1] = hashMap.get(nums[i]);
                result[0] = i;
                return result;
            }
            hashMap.put(target - nums[i], i);
        }
        return result;
    }

}