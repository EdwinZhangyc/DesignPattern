package com.zyc.factory.method;

public class TestMain {

    public static void main (String[]  args){
        PizzaStore pizzaStore = new NYStylePizzaStore();
        pizzaStore.orderPizza("cheese");

        System.out.println();
        PizzaStore pizzaStore1 = new ChicagoStylePizzaStore();
        pizzaStore1.orderPizza("cheese");
    }
}