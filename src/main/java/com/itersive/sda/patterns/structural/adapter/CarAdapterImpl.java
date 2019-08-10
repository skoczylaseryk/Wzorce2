package com.itersive.sda.patterns.structural.adapter;

public class CarAdapterImpl implements CarAdapter {
    private AmericanCar car;

    public CarAdapterImpl(AmericanCar car) {
        this.car = car;
    }

    @Override
    public double getMaxSpeed() {
        return car.getMaxSpeed() * 1.60934;
    }
}
