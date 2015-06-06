package com.levik.patterns.factory;

public class ComputerFactory {

    public static Computer getComputer(ComputerType computerType, String ram, String hdd, String cpu){

        switch (computerType){
            case PC: {
                return new PC(ram, hdd, cpu);
            }
            case SERVER:{
                return new Server(ram, hdd, cpu);
            }
            default:
                System.err.println("Computer with type " + computerType.name() + " not fount");
        }

        return null;
    }
}
