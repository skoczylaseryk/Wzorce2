package com.itersive.sda.patterns.creational.singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred during creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

    private StaticBlockSingleton() {

    }
}
