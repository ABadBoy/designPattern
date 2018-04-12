package com.badboy.creational.patterns.factoryMethodPattern;

public class AudiFactory implements CarFacotry {

    public Car createCar() {
        return new Audi();
    }
}
