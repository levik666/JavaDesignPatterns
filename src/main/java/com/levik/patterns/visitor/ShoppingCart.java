package com.levik.patterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Visitable> items;

    public ShoppingCart(final List<Visitable> items) {
        this.items = new ArrayList<>(items);
    }

    public double calculatePostage() {
        final PostageVisitor visitor = new PostageVisitor();
        for(final Visitable item: items) {
            item.accept(visitor);
        }
        return visitor.getTotalPostage();
    }

    public static void main(String[] args) {
        final List<Visitable> items = new ArrayList<>();
        items.add(new Book(1, 2));
        items.add(new Book(15, 3));

        final ShoppingCart shoppingCart = new ShoppingCart(items);

        System.out.println("ShoppingCart totalPostage : " + shoppingCart.calculatePostage());
    }
}
