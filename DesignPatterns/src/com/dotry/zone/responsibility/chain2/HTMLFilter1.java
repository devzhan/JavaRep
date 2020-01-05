package com.dotry.zone.responsibility.chain2;

public class HTMLFilter1 implements Filter1 {

    @Override
    public boolean doFilter(Request request, Response response,
                         FilterChain1 filterChain) {
        request.setRequestStr(request.getRequestStr().replace('<', '[').replace(">", "]")+"---HTMLFilter()");
//        return  false;
        filterChain.doFilter(request, response, filterChain);
        //经历html过滤后的结果
        response.setResponseStr(response.getResponseStr()+"---HTMLFilter()");
        return false;
    }

}