package com.itersive.sda.patterns.creational.factory.method;

public abstract class ShapeFactory {
    public static Shape getShape(ShapeType type) {
        Shape shape;
        switch (type) {
            case CIRCLE:
                shape = new Circle();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
            default:
                shape = null;
        }
        return shape;
    }
}
