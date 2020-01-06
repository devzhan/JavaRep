package com.dotry.zone.responsibility;

import com.dotry.zone.responsibility.Employee;

public interface ApplyFilter {
    boolean doFilter(Employee employee,ApplyFilterChain chain);
}
