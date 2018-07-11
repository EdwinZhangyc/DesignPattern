package com.zyc.factory.abstractfactory;


import com.zyc.factory.method.*;
import com.zyc.factory.method.Pizza;
import com.zyc.factory.method.PizzaStore;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        } else if(type.equals("veggle")){
            pizza = new ChicagoStyleVegglePizza();
        } else if(type.equals("clam")){
            pizza = new ChicagoStyleClamPizza();
        }
        return pizza;
    }
}