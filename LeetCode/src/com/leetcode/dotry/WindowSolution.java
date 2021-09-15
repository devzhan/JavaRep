package com.leetcode.dotry;

import java.util.Deque;
import java.util.LinkedList;

public class WindowSolution {
    public  int[] maxSlidWindow(int[] nums,int k){
        int[] res = new int[nums.length-k+1];
        Deque<Integer> stack = new LinkedList<>();
        for (int i=0;i<nums.length;i++){
            while (!stack.isEmpty()&&nums[stack.peekLast()]<nums[i]){
                stack.removeLast();
            }
            stack.addLast(i);

            if (stack.peekFirst()==i-k){
                stack.removeFirst();
            }
            if (i>=k-1){
                res[i-k+1] = nums[stack.peekFirst()];
            }
        }
        return res;
    }
}
