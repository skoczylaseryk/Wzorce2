package com.itersive.sda.patterns.behavioral.strategy;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void pay(double price) {
        // use credit card to pay
    }
}
