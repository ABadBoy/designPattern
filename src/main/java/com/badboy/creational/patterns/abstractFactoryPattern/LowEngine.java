package com.badboy.creational.patterns.abstractFactoryPattern;

public class LowEngine implements Engine {
    public void run() {
        System.out.println("跑的慢");
    }

    public void start() {
        System.out.println("启动慢");
    }
}
