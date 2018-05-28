package com.badboy.structuralPatterns.decorator;

public class AutoCar extends SupperCar {

    public AutoCar(Icar icar) {
        super(icar);
    }

    public void auto() {
        System.out.println("自动跑");
    }

    @Override
    public void move() {
        super.move();
        auto();
    }
}
