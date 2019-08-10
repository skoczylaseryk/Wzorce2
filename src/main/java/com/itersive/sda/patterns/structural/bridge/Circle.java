package com.itersive.sda.patterns.structural.bridge;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.paint();
    }
}
