package com.zyc.Strategy.duck;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm Filying");
    }
}