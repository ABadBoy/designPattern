package com.badboy.structuralPatterns.decorator;

public class SupperCar implements  Icar {

    private Icar car;

    public SupperCar(Icar icar) {
        super();
        this.car = icar;
    }
    public void move() {
        car.move();
    }
}
