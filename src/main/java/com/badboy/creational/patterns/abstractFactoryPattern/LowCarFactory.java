package com.badboy.creational.patterns.abstractFactoryPattern;

public class LowCarFactory implements CarFactory {

    public Engine createEngine() {
        return new LowEngine();
    }

    public Seat createSeat() {
        return new LowSeat();
    }

    public Tyre createTyre() {
        return new LowTyre();
    }
}
