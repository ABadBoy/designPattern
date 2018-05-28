package com.badboy.structuralPatterns.decorator;

public class FlyCar extends SupperCar {
    public FlyCar(Icar icar) {
        super(icar);
    }

    public void fly() {
        System.out.println("天上飞");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}
