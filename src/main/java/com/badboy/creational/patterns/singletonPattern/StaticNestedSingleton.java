package com.badboy.creational.patterns.singletonPattern;

public class StaticNestedSingleton {
    private static StaticNestedSingleton staticNestedSingleton;

    private static class SingletonInstance{
        private static StaticNestedSingleton singleton = new StaticNestedSingleton();
    }

    private StaticNestedSingleton() {
    }

    public static StaticNestedSingleton getInstance() {
        return SingletonInstance.singleton;
    }
}
