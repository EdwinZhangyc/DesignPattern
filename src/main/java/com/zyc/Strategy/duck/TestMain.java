package com.zyc.Strategy.duck;

public class TestMain {

    public static void main(String[] args){
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();
        mallardDuck.swim();

        //使用setter实现对象在执行时，实现动态更换行为，
        //在运行时实现改变鸭子状态
        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.setQuackBehavior(new MuteQuack());
        mallardDuck.performQuack();
        mallardDuck.performFly();
    }
}