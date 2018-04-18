package com.badboy.structuralPatterns.proxy.staticProxy;

public class ProxyStar implements Star {

    private Star realStar;

    public ProxyStar(Star realStar) {
        this.realStar = realStar;
    }

    public void saleTickets() {
        System.out.println("ProxyStar.saleTickets");
    }

    public void sing() {
        realStar.sing();
    }

    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney");
    }
}
