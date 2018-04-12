package com.badboy.creational.patterns.simpleFactoryPattern;

public class CarFactory {

    public static Car createCar(String s){
        if ("audi".equals(s)) {
            return new Audi();
        } else if ("byd".equals(s)) {
            return new Byd();
        } else {
            return null;
        }
    }
}
