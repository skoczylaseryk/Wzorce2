package com.itersive.sda.patterns.creational.factory.abstractFactory;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {
        if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
            return new RoundedRectangle();
        } else if ("SQUARE".equalsIgnoreCase(shapeType)) {
            return new RoundedSquare();
        }
        return null;
    }
}
