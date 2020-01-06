package com.dotry.zone.responsibility.chain2;

import java.util.ArrayList;
import java.util.List;

public class FilterChain1 implements Filter1 {

    private List<Filter1> filters = new ArrayList<Filter1>();
    int index = 0;    //标记执行到第几个filter

    //把函数的返回值设为FilterChain，返回this,就能方便链式编写代码
    public FilterChain1 addFilter(Filter1 filter) {
        filters.add(filter);
        return this;
    }

    public boolean doFilter(Request request, Response response, FilterChain1 fc) {

        if(index == filters.size()) return false;
        Filter1 f = filters.get(index);
        index++;
        if (!f.doFilter(request,response,fc)) {
            index = filters.size();
            return false;
        }


       return true;
    }

}
