package com.badboy.creational.patterns.abstractFactoryPattern;

public class Client {
    public static void main(String[] args) {
        CarFactory carFactory = new LuxuryCarFactory();
        Engine engine = carFactory.createEngine();
        engine.start();
        engine.run();

        Seat seat = carFactory.createSeat();
        seat.massage();

        CarFactory lowCarFactory = new LowCarFactory();
        Engine lowEngine = lowCarFactory.createEngine();
        lowEngine.start();
        lowEngine.run();

    }
}
