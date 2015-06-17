package com.levik.patterns.decorator;

import java.math.BigDecimal;

public abstract class SandwichDecorator extends Sandwich {

    @Override
    public abstract BigDecimal price();

}