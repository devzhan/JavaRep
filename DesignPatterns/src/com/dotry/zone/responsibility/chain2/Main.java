package com.dotry.zone.responsibility.chain2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String msg = "<html>敏感字眼</html>";

        Request request = new Request();
        request.setRequestStr(msg);
        Response response = new Response();
        response.setResponseStr("response------------");

        FilterChain1 fc = new FilterChain1();
        fc.addFilter(new HTMLFilter1()).addFilter(new SensitiveFilter());

        fc.doFilter(request, response, fc);
        System.out.println(request.getRequestStr());
        System.out.println(response.getResponseStr());
    }
}
