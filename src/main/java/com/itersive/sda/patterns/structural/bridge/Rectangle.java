package com.itersive.sda.patterns.structural.bridge;

public class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.paint();
    }
}
