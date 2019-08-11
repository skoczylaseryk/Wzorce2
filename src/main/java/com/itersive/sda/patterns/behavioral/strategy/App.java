package com.itersive.sda.patterns.behavioral.strategy;

public class App {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addBook(new Book("Krzyzacy", 10.0));
        cart.addBook(new Book("Wiedzmin", 20.0));
        cart.pay(new PaypalStrategy());
        cart.pay(new CreditCardStrategy());
    }

}
