package com.zyc.Decorator;

public class TestMain {

    public static void main(String[] args){
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription() + "    " + beverage.cost());

        //beverage = new Mocha(new Milk(beverage));
        Milk milk = new Milk(beverage);
        System.out.println(milk.getDescription() + "    " + beverage.cost());
    }
}