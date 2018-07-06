package com.zyc.Decorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ",Nocha";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.12;
    }
}