package com.badboy.structuralPatterns.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        Star star = new RealStar();
        StarHandler starHandler = new StarHandler(star);

        Star o = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, starHandler);
        o.sing();

    }
}
