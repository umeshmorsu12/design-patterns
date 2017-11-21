package com.morsu.designpatterns.creational.factorymethod;

/*
    Factory design pattern can be an interface, abstract class or normal java class
 */
public abstract class Computer {

    public abstract String getRam();
    public abstract String getHdd();
    public abstract String getCpu();

    @Override
    public String toString() {
        return  "RAM= "  + this.getRam() +
                ", HDD=" + this.getHdd() +
                ", CPU=" + this.getCpu();
    }
}