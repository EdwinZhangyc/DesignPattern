package com.zyc.factory.abstractfactory;


public abstract class PizzaStore {


    public final Pizza orderPizza(String type){
        Pizza pizza = createPizza (type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract com.zyc.factory.abstractfactory.Pizza createPizza(String type);
}