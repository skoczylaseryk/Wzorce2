package com.itersive.sda.patterns.structural.decorator;

public class SuvCar extends CarDecorator {
    public SuvCar(Car car) {
        super(car);
    }

    @Override
    public void create() {
        super.create();
        // add Suv stuff
    }
}
