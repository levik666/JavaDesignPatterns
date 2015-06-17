package com.levik.patterns.decorator;

public class SandwichMaker {

    public static void main(String args[]) {

        Sandwich mySandwich = new WhiteBreadSandwich("White bread Sandwich");
        System.out.printf("Price of %s is $%.2f %n", mySandwich.getDescription(),
                mySandwich.price());

        mySandwich = new CheeseDecorator(mySandwich);
        System.out.printf("Price of %s is $%.2f %n", mySandwich.getDescription(),
                mySandwich.price());
    }
}
