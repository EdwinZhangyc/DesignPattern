package com.zyc.factory.abstractfactory;

public class NYStylePizzaStore extends PizzaStore {

    Pizza pizza = null;
    PizzaIngredientFactory pizzaIngredientFactory;

    NYStylePizzaStore () {
        this.pizzaIngredientFactory = new NYPizzaIngredientFactory();
    }
    @Override
    public Pizza createPizza(String type) {
        if(type.equals("cheese")){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if(type.equals("clam")){
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }
}