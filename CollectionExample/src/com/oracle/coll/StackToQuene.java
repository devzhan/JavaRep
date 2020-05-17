package com.oracle.coll;

import java.util.Stack;

public class StackToQuene {
    private Stack<Integer> pushStack = new Stack<>();
    private Stack<Integer> popStack = new Stack<>();

    public void push(int i ){
        pushStack.push(i);
    }

    public int pop(){
        if (popStack.size()==0){
          while (!pushStack.isEmpty()){
              int temp = pushStack.peek();
              popStack.push(temp);
              pushStack.pop();
          }
        }
        int res = popStack.peek();
        popStack.pop();
        return res;
    }
}
