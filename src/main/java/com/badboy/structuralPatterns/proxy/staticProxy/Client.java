package com.badboy.structuralPatterns.proxy.staticProxy;

public class Client {

    public static void main(String[] args) {
        Star realStar = new RealStar();
        Star proxyStar = new ProxyStar(realStar);

        proxyStar.saleTickets();
        proxyStar.sing();
        proxyStar.collectMoney();

    }
}
