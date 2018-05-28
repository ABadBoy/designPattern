package com.badboy.structuralPatterns.decorator;

public class Client {

    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        System.out.println("===================");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();
        System.out.println("===================");
        WaterCar waterCar = new WaterCar(flyCar);
        waterCar.move();
        System.out.println("===================");
        AutoCar autoCar = new AutoCar(waterCar);
        autoCar.move();
    }


}
