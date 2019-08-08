package com.itersive.sda.patterns.creational.factory.abstractFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
