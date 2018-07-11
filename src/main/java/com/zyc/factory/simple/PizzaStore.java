package com.zyc.factory.simple;

public class PizzaStore {

    SimplePizzaFactory simplePizzaFactory = null;

    PizzaStore(){
        simplePizzaFactory = new SimplePizzaFactory();
    }

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = simplePizzaFactory.createPizza (type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}