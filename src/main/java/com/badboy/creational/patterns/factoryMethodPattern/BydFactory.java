package com.badboy.creational.patterns.factoryMethodPattern;

public class BydFactory implements CarFacotry {

    public Car createCar() {
        return new Byd();
    }
}
