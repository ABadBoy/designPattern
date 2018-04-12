package com.badboy.creational.patterns.factoryMethodPattern;

public class Client {
    public static void main(String[] args) {
        Car car1 = new AudiFactory().createCar();
        Car car2 = new BydFactory().createCar();


        car1.run();
        car2.run();
    }
}
