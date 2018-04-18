package com.badboy.structuralPatterns.proxy.staticProxy;

public class RealStar implements Star {
    public void saleTickets() {
        System.out.println("RealStar.saleTickets");
    }

    public void sing() {
        System.out.println("RealStar.sing");
    }

    public void collectMoney() {
        System.out.println("RealStar.collectMoney");
    }
}
