package com.dotry.zone.responsibility;

/**
 * 主管审批
 */

public class SupervisorApplyFilter implements  ApplyFilter{

    @Override
    public boolean doFilter(Employee employee,ApplyFilterChain chain) {
        if (employee.getPrice()<=100){
            System.out.println("资金小于100主管审批通过，流程结束");
            employee.setMsg(employee.getMsg()+"资金小于100主管审批通过，流程结束");
            return false;
        }else {
            System.out.println("资金大于100主管请经理审批");
            employee.setMsg(employee.getMsg()+"资金大于100主管请经理审批->");
            chain.doFilter(employee,chain);
            return true;
        }
    }
}
