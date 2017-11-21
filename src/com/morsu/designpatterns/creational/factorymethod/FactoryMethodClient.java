package com.morsu.designpatterns.creational.factorymethod;

import java.util.logging.Logger;

public class FactoryMethodClient {

    private static Logger logger = Logger.getLogger(FactoryMethodClient.class.getName());

    public static void main(String args[]){
        Computer pc = ComputerFactory.getComputer("pc","32 GB", "500 GB", "2.4 GHZ");

        Computer server = ComputerFactory.getComputer("server", "100 GB", "1 TB", "2.9 GHZ");

        logger.info("Factory PC configuration: " + pc);
        logger.info("Factory Server configuration: " + server);
    }

}
