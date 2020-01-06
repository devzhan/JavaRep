package com.dotry.zone.responsibility.chain2;

public class SensitiveFilter implements Filter1 {

    @Override
    public boolean doFilter(Request request, Response response,
                         FilterChain1 filterChain) {
        System.out.println("doFilter====");
        request.setRequestStr(request.getRequestStr().replace("敏感", "幸福")+"---SensitiveFilter()");
        filterChain.doFilter(request, response, filterChain);
        //经历SensitiveFilter过滤后的结果
        response.setResponseStr(response.getResponseStr()+"---SensitiveFilter()");
        return true;
    }

}