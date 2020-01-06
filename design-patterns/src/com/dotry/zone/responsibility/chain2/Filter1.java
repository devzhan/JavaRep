package com.dotry.zone.responsibility.chain2;

public interface Filter1 {
    public boolean doFilter(Request request, Response response, FilterChain1 filterChain);
}

