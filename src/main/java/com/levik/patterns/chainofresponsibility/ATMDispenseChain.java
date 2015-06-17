package com.levik.patterns.chainofresponsibility;

public class ATMDispenseChain {

    private DispenseChain chain;

    public ATMDispenseChain() {
        // initialize the chain
        chain = new Dollar50Dispenser();

        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        // set the chain of responsibility
        chain.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();

        int amount = 530;

        if (amount % 10 != 0) {
            System.out.println("Amount should be in multiple of 10s.");
            return;
        }

        // process the request
        atmDispenser.chain.dispense(new Currency(amount));
    }

}
