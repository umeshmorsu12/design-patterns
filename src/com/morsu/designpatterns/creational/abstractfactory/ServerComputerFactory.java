package com.morsu.designpatterns.creational.abstractfactory;

import com.morsu.designpatterns.creational.factorymethod.Computer;
import com.morsu.designpatterns.creational.factorymethod.Server;

public class ServerComputerFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public ServerComputerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(ram,hdd,cpu);
    }

}
