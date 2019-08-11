package com.itersive.sda.patterns.behavioral.strategy;

public class PaypalStrategy implements PaymentStrategy {
    @Override
    public void pay(double price) {
        // use paypal to pay
    }
}
