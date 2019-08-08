package com.leetcode.dotry;

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
        int length = Solution.lengthOfLongestSubstring("abc");
        System.out.println("length is :"+length);
    }
   static class Solution {
        public static int lengthOfLongestSubstring(String s) {
            int l =0;
            int r = -1;
            int res = 0;
            int [] freq = new int[256];
            while(l<s.length()){
                if(r+1<s.length()&&freq[s.charAt(r+1)]==0){
                    r++;
                    freq[(int)s.charAt(r)]++;
                }else{
                    freq[(int)(s.charAt(l++))]--;
                }
                res = Math.max(res,r-l+1);
            }
            return res;
        }
    }

}

