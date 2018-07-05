package com.zyc.Strategy.duck;

public class MallardDuck extends Duck {

    MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck");
    }

    public static void main(String[] args){
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();
        mallardDuck.swim();
    }
}