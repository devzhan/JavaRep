package com.oracle.coll;

public class ListNode<T> {
    class Node<T> {
        T data;
        Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(T data) {
            this(data, null);
        }
    }

    private Node head;
    private int size;

    public ListNode() {
        this.head = null;
        this.size = 0;
    }

    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }

    private void addFirst(T t){
        Node node = new Node(t);
        node.next = this.head;
        this.head = node;
        this.size ++;
    }

    public void add(T t, int index){
        if (index<0||index>size){
            throw new RuntimeException("插入位置超出范围");
        }
        if (index ==0){
            addFirst(t);
        }
        Node pre = this.head;
        for (int i =0;i<index;i++){
            pre = pre.next;
        }
        Node node = new Node(t);
        node.next = pre.next;
        pre.next = node;
        this.size++;
    }

    public Node remove(T t){
        if (head==null||head.next==null){
            return null;
        }
        Node pre = head;
        while (pre.next != null){
            if (pre.next.data.equals(t)){
                Node node = pre.next;
                pre.next = pre.next.next;
                size --;
                return node;
            }
            pre= pre.next;
        }
        return null;
    }

    public Node search(T t){
        Node pre = head;
        if (pre.data.equals(t)){
            return head;
        }
        while (pre.next!=null){
            if (pre.next.data.equals(t)){
                return pre.next;
            }
        }
        return null;
    }

    public Node update(T old,T value){

        Node pre = head;
        while (pre.next!=null){
            if (pre.next.data.equals(old)){
                pre.next.data = value;
                return pre.next;
            }
            pre = pre.next;
        }
        return null;
    }

}