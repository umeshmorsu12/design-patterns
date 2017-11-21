package com.morsu.designpatterns.creational.abstractfactory;

import com.morsu.designpatterns.creational.factorymethod.Computer;
import com.morsu.designpatterns.creational.factorymethod.PersonalComputer;

public class PersonalComputerFactory  implements ComputerAbstractFactory{

    private String ram;
    private String hdd;
    private String cpu;

    public PersonalComputerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new PersonalComputer(ram,hdd,cpu);
    }
}
