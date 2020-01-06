package com.dotry.zone.responsibility;

/**
 * 经理审批
 */

public class ManagerApplyFilter implements  ApplyFilter{

    @Override
    public boolean doFilter(Employee employee ,ApplyFilterChain chain) {
        if (employee.getPrice()<=500){
            System.out.println("资金小于500经理审批通过，流程结束");
            employee.setMsg(employee.getMsg()+"资金小于500经理审批通过，流程结束");
            return false;
        }else {
            System.out.println("资金大于500经理请总经理审批");
            employee.setMsg(employee.getMsg()+"资金大于500经理请总经理审批->");
            chain.doFilter(employee,chain);
            return true;
        }
    }
}
