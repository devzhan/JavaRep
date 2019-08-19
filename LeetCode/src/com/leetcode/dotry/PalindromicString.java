package com.leetcode.dotry;

/**
 * 用单链表如何判断一个字符串是否是回文字符串
 *
 */
public class PalindromicString {
    public static void main(String[] args) {

    }


    public static boolean isPalindromicString(ListNode head){
        if (head==null||head.next ==null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head ;
        ListNode pre = null;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            ListNode next = slow.next;
            slow.next = pre;
            pre = slow;
            slow = next;
        }
        if (fast!=null){
            slow = slow.next;
        }
        while (slow != null) {
            if (slow.val != pre.val) {
                return false;
            }
            slow = slow.next;
            pre = pre.next;
        }
        return true;
    }
   static class ListNode{
        String val ;
        ListNode next;
        ListNode(String val){
            this.val = val;
        }
    }
}
