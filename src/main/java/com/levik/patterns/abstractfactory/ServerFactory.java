package com.levik.patterns.abstractfactory;

import com.levik.patterns.factory.Computer;
import com.levik.patterns.factory.Server;

public class ServerFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    public Computer createComputer() {
        return new Server(ram, hdd, cpu);
    }
}
