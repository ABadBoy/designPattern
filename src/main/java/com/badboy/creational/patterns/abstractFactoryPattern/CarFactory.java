package com.badboy.creational.patterns.abstractFactoryPattern;

public interface CarFactory {

    Engine createEngine();

    Seat createSeat();

    Tyre createTyre();
}
