package com.oracle.coll;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueneToStack {


    Queue<Integer> queue1 = new ArrayDeque<Integer>();
    Queue<Integer> queue2 = new ArrayDeque<Integer>();

    public void push(int node) {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            queue1.offer(node);
        } else if (!queue1.isEmpty()) {
            queue1.offer(node);
        } else {
            queue2.offer(node);
        }
    }

    public int pop(){
        if (queue1.isEmpty()&&queue2.isEmpty()){
            throw new RuntimeException("两个队列元素均为空");
        }
        if (!queue1.isEmpty()){
            if (queue1.size()==1){
                return queue1.poll();
            }else {
                while (queue1.size()>1){
                    queue2.offer(queue1.poll());
                }
                return queue1.poll();
            }
        }
        if (queue2.size()==1){
            return queue2.poll();
        }else {
            while (queue2.size()>1){
                queue1.offer(queue2.poll());
            }
            return queue2.poll();
        }
    }
}
