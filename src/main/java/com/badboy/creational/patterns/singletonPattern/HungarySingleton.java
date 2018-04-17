package com.badboy.creational.patterns.singletonPattern;

public class HungarySingleton {

    private static HungarySingleton hungarySingleton = new HungarySingleton();

    private HungarySingleton() {
    }

    public static HungarySingleton getInstance() {
        return hungarySingleton;
    }
}
