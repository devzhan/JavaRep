package com.dotry.zone.responsibility.chain;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Message message = new Message();
        message.setMsg("你好，<script> 责任链模式，详情请访问 baidu.com");
//        ArrayList<Filter> arrayList = new ArrayList<>();
//        arrayList.add(new HTMLFilter());
//        arrayList.add(new WordFilter());
//        for (Filter filter :arrayList){
//            filter.doFilter(message);
//        }
//        System.out.println(message.msg);
        FilterChain filterChain = new FilterChain();
        filterChain.add(new HTMLFilter()).add(new WordFilter());
        filterChain.doFilter(message);
        System.out.println(message.msg);
    }
}
class Message {
    String msg;
    String name ;
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

interface Filter{
    void doFilter(Message message);
}
class HTMLFilter implements Filter{

    @Override
    public void doFilter(Message message) {
        String msg = message.getMsg();
        msg= msg.replace("<","[");
        message.setMsg(msg);
    }
}

class WordFilter implements  Filter{
    @Override
    public void doFilter(Message message) {
        String msg = message.getMsg();
        msg = msg.replace("baidu.com","http://www.baidu.com");
        message.setMsg(msg);
    }
}

class  FilterChain implements  Filter{
    ArrayList<Filter> filters = new ArrayList<>();
    FilterChain add(Filter filter){
        filters.add(filter);
        return this;
    }
    @Override
    public void doFilter(Message message) {
        for (Filter filter :filters){
            filter.doFilter(message);
        }
    }
}
