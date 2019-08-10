package com.leetcode.dotry;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 *
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 * 示例 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * 则中位数是 2.0
 * 示例 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * 则中位数是 (2 + 3)/2 = 2.5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/median-of-two-sorted-arrays
 */
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nmus1 = new int[] {
            1,3
        };
        int[] nmus2 = new int[] {
                2
        };
       double result =  Solution.findMedianSortedArrays(nmus1,nmus2);
        System.out.println("result==="+result);
    }
   static class Solution {
        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m = nums1.length;
            int n = nums2.length;
            double midean1 =0;
            double midean2 =0;
            for (int i =0;i<m+n;i++){
                if (i<m){
                    if (m%2==0){
                        midean1 = (nums1[m/2]+nums1[m/2-1])/2f;
                    }else {
                        midean1 = nums1[m/2];
                    }
                }else {
                    if (n%2==0){
                        midean2 = (nums2[n/2]+nums2[n/2-1])/2f;
                    }else {
                        midean2= nums1[n/2];
                    }
                }
            }
            return (midean1+midean2)/2f;
        }
    }
}
