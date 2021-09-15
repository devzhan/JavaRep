package com.leetcode.dotry;

import java.util.Stack;

public class StackQueue<T> {
    private Stack<T> stack1= new Stack<>();//入队列
    private Stack<T> stack2= new Stack<>();//出队列
    public void push(T node){
        while (!stack2.empty()){
            stack1.push(stack2.peek());
            stack2.pop();
        }
        stack1.push(node);
    }

    public T pop(){
        while (!stack1.isEmpty()){
            stack2.push(stack1.peek());
            stack1.pop();
        }
        T temp = stack2.peek();
        stack2.pop();
        return temp;
    }
}
