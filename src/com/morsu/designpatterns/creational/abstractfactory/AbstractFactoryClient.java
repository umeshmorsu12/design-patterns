package com.morsu.designpatterns.creational.abstractfactory;

import com.morsu.designpatterns.creational.factorymethod.Computer;

import java.util.logging.Logger;

public class AbstractFactoryClient {

    private static Logger logger = Logger.getLogger(AbstractFactoryClient.class.getName());

    public static void main(String args[]){
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PersonalComputerFactory("16 GB", "500 GB", "2.4 GHZ"));

        Computer server = ComputerFactory.getComputer(new ServerComputerFactory("100 GB", "1 TB", "2.9 GHZ"));

        logger.info("AbstractFactory PC Config: " + pc);
        logger.info("AbstractFactory Server Config: " + server);
    }
}
