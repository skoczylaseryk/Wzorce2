package com.itersive.sda.patterns.structural.decorator;

public class SportsCar extends CarDecorator {
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void create() {
        super.create();
        // add sport stuff
    }
}
