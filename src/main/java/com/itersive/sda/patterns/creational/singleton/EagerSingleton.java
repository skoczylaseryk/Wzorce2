package com.itersive.sda.patterns.creational.singleton;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    public EagerSingleton getInstance() {
        return instance;
    }

    private EagerSingleton() {

    }
}
