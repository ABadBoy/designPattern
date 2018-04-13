package com.badboy.creational.patterns.abstractFactoryPattern;

public class LuxuryEngine implements Engine {

    public void run() {
        System.out.println("跑的快");
    }

    public void start() {
        System.out.println("启动快");
    }
}
