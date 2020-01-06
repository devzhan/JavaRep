package com.dotry.zone;

import com.dotry.zone.responsibility.*;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setMsg("物料采购申请->");
        employee.setPrice(10);
        ApplyFilterChain applyFilterChain = new ApplyFilterChain();
        applyFilterChain.add(new SupervisorApplyFilter()).add(new ManagerApplyFilter()).add(new GeneralManagerApplyFilter());
        applyFilterChain.doFilter(employee,applyFilterChain);
        System.out.println(employee.getMsg());

    }
}