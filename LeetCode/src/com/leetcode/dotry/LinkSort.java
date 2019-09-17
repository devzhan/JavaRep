package com.leetcode.dotry;

import javax.xml.soap.Node;

public class LinkSort {
    public static void main(String[] args) {
        NodeList one = new NodeList(1);
        NodeList two = new NodeList(-1);
        NodeList three = new NodeList(0);
        one.next = two;
        two.next = three;
        sortData(one);
        System.out.println(one.val);
    }
    static class NodeList {
        int val ;
        NodeList next;
        public NodeList(int val) {
            this.val = val;
        }
    }

    public static NodeList sortData(NodeList head){
        if (head == null){
            return null;
        }
        NodeList cur = head.next;
        if (cur== null){
            return head;
        }
        NodeList pre = head;
        NodeList fakeNode = new NodeList(-1);
        fakeNode.next = head;
        while (cur!=null){
            if (cur.val<pre.val){
                pre.next = cur.next;
                NodeList node1= fakeNode;
                NodeList node2 = fakeNode.next;
                while (cur.val>node2.val){
                    node1 = node2 ;
                    node2 = node2.next;
                }
                node1.next = cur;
                cur.next = node2;
                cur = pre.next;
            }else {
                pre = cur;
                cur = cur.next;
            }
        }
        return fakeNode.next;
    }

}
