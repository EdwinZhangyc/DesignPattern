package com.zyc.factory.method;


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