package com.badboy.structuralPatterns.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {

    private Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = null;
        System.out.println("sales tickets");
        if (method.getName().equals("sing")) {
            invoke = method.invoke(realStar, args);
        }
        System.out.println("collect money");
        return invoke;
    }
}
