package com.dotry.zone.responsibility;

/**
 * 总经理审批
 */

public class GeneralManagerApplyFilter implements  ApplyFilter{


    @Override
    public boolean doFilter(Employee employee ,ApplyFilterChain chain) {
        if (employee.getPrice()<=5000){
            System.out.println("资金小于5000总经理审批通过，流程结束");
            employee.setMsg(employee.getMsg()+"资金小于5000总经理审批通过，流程结束");
            return false;
        }else {
            System.out.println("资金大于5000, 总经理需要开会讨论，流程结束");
            employee.setMsg(employee.getMsg()+"资金大于5000, 总经理需要开会讨论，流程结束");
            return true;
        }
    }
}
