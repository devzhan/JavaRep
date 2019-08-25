package com.leetcode.dotry;

public class StringMoslemsJudge {
    public static void main(String[] args) {
        ListNode first = new ListNode("a");
        first.next = new ListNode("b");
        first.next.next = new ListNode("a");
        System.out.println(isMoslems(first));
    }
    static class ListNode{
        String val ;
        ListNode next;
        ListNode(String x ){
            val = x;
        }
    }
    public static boolean isMoslems(ListNode head){
        if (head == null||head.next==null){
            return true;
        }
        ListNode slow  = head;
        ListNode fast = head;
        ListNode pre = null;
        while (fast!=null&&fast.next!=null){
            fast = fast.next.next;
            ListNode next = slow.next;
            slow.next = pre;
            pre = slow;
            slow = next;
        }
        if (fast!=null){
            slow = slow.next;
        }

        while (slow!=null){
            if (slow.val!=pre.val){
                return false;
            }
            System.out.println(slow.val);
            slow =slow.next;
            pre = pre.next;
        }
        return  true;
    }
}
