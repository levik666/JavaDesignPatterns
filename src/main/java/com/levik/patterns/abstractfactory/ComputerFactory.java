package com.levik.patterns.abstractfactory;

import com.levik.patterns.factory.Computer;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();

    }
}
