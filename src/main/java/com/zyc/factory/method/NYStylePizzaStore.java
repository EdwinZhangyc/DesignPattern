package com.zyc.factory.method;


public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        } else if(type.equals("veggle")){
            pizza = new NYStyleVegglePizza();
        } else if(type.equals("clam")){
            pizza = new NYStyleClamPizza();
        }
        return pizza;
    }
}