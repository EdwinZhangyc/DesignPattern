package com.zyc.factory.method;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Sauce and Cheese Pizza";
        dough = "Thin Crush Dough";
        sauce = "Marinara Sauce";

        toppings.add("Crated Reggiano Cheese");
    }

    //重寫該方法，由於芝加哥的pizza切割成方形
    @Override
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}