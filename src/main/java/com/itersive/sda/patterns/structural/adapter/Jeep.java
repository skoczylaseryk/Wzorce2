package com.itersive.sda.patterns.structural.adapter;

public class Jeep implements AmericanCar {
    @Override
    public double getMaxSpeed() {
        return 100; // mph
    }
}
