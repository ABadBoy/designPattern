package com.badboy.structuralPatterns.decorator;

public class WaterCar extends SupperCar {

    public WaterCar(Icar icar) {
        super(icar);
    }

    public void swim() {
        System.out.println("水中游");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}
