package com.zyc.Adapter;

public class Testmain {

    public static void main(String[] args){

        ThurkeyInstance instance = new ThurkeyInstance();
        Duck duck = new TurkeyAdapter(instance);
        duck.fly();
        duck.quack();
    }
}