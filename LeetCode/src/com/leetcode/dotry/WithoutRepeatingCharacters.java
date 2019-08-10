package com.leetcode.dotry;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 思路： 将字符转成数字
 */
public class WithoutRepeatingCharacters {

    public static void main(String[] args) {
        int length = Solution.lengthOfLongestSubstring("abac");
        System.out.println("length is :"+length);
    }
   static class Solution {
        public static int lengthOfLongestSubstring(String s) {
            int l = 0;
            int [] dp = new int[s.length()+1];
            for(int i=0;i<s.length();i++){
                String s1 = s.substring(l,i);
                char ch = s.charAt(i);
               int index = s1.indexOf(ch);
                if(index!=-1){//找到一个重复的字符,记录下这个坐标。
                    char  s2 = ch;

                    l = s.indexOf(s2, l)+1;
                }
                dp[i+1] = Math.max(dp[i], i-l+1);
            }
            return dp[s.length()];
        }

       public int lengthOfLongestSubstring1(String s) {
           // 字符上次出现的位置
           Map<Character, Integer> charLastPos = new HashMap<Character, Integer>();
           int start = -1; // 子串起始位置为start+1
           int maxLen = 0; // 最长子串长度
           int len = s.length(); // 记录字符串长度，避免for循环多次都调用函数
           for (int i = 0; i < len; i++) {
               Character cur = s.charAt(i);
               if (charLastPos.containsKey(cur)) {
                   // 当前字符上一次出现的位置
                   int lastPos = charLastPos.get(cur);
                   // 出现重复字符时，比较字符上次出现的位置与当前子串start大小
                   // 若小于start，说明不在当前子串里，start不变
                   // 若大于start，说明在当前子串里，把start更新到字符上次出现的位置
                   if (lastPos > start) {
                       start = lastPos;
                   }
               }
               // 子串其实是从start+1位置开始
               // 子串长度计算公式为：i-(start+1)+1，简化为i-start
               int curLen = i - start;
               if (curLen > maxLen) {
                   maxLen = curLen;
               }
               charLastPos.put(s.charAt(i), i);
           }
           return maxLen;
       }
    }




}

