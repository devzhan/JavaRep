package com.leetcode.dotry;

import sun.rmi.server.InactiveGroupException;

import java.util.HashMap;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 *
 * 示例 1：
 *
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * 示例 2：
 *
 * 输入: "cbbd"
 * 输出: "bb"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 */
public class LongestPalindromicSubstring {
    public static void main(String[] args) {

    }

    class Solution {
        public String longestPalindrome(String s) {
            if (s==null||s.length()<3){
                return " ";
            }
            int start=0;
            int end = 0;
            HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
            int i =0;
            while (i<s.length()){
                String object = s.substring(i,i+1);
                if (hashMap.containsKey(object)){
                    int lastPos = hashMap.get(object);
                    if (i-lastPos>=2){

                    }
                }
                hashMap.put(object,i);
            }
        }


    }
}
