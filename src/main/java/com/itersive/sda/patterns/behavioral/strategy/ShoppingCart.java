package com.itersive.sda.patterns.behavioral.strategy;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {
    List<Book> books;

    public ShoppingCart() {
        this.books = new LinkedList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Double total() {
        return books.stream().map(Book::getPrice).reduce(0.0, Double::sum);
    }

    public void pay(PaymentStrategy payment) {
        payment.pay(total());
    }
}
