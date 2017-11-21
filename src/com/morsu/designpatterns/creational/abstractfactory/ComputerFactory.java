package com.morsu.designpatterns.creational.abstractfactory;

import com.morsu.designpatterns.creational.factorymethod.Computer;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
