package com.levik.patterns.visitor;

public class Book implements Visitable{

    private final double price;
    private final double weight;

    public Book(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
