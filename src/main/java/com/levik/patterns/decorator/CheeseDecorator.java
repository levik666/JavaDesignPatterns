package com.levik.patterns.decorator;

import java.math.BigDecimal;

public class CheeseDecorator extends SandwichDecorator{
    private Sandwich currentSandwich;

    public CheeseDecorator(Sandwich sandwich){
        this.currentSandwich = sandwich;
    }

    @Override
    public String getDescription(){
        return currentSandwich.getDescription() + ", Cheese";
    }
    @Override
    public BigDecimal price() {
        return currentSandwich.price().add(new BigDecimal("0.50"));
    }

}
