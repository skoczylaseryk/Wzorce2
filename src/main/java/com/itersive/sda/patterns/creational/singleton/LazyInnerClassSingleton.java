package com.itersive.sda.patterns.creational.singleton;

public class LazyInnerClassSingleton {

    private static class SingletonHelper {
        private static final LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
    }

    public LazyInnerClassSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private LazyInnerClassSingleton() {

    }
}
