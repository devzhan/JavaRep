package com.dotry.zone.responsibility;

import java.util.ArrayList;
import java.util.List;

public class ApplyFilterChain implements ApplyFilter {

    List<ApplyFilter> filters = new ArrayList<>();
    int index = 0;

    public ApplyFilterChain add(ApplyFilter applyFilter){
        filters.add(applyFilter);
        return this;
    }

    @Override
    public boolean doFilter(Employee employee,ApplyFilterChain chain) {
        if (index>=filters.size()) return false;
        ApplyFilter filter = filters.get(index);
        index ++;
        filter.doFilter(employee,chain);
        return true;
    }
}
