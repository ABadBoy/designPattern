package com.badboy.creational.patterns.simpleFactoryPattern;

public class Client {

    public static void main(String[] args) {
        Car audo = CarFactory.createCar("audi");
        Car byd = CarFactory.createCar("byd");

        audo.run();
        byd.run();
    }
}
