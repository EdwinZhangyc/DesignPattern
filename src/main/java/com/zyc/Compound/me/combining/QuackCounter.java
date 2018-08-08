package com.zyc.Compound.me.combining;

import com.zyc.Compound.me.combining.Observer.Observer;

public class QuackCounter implements Quackble {

    Quackble duck;
    static int numberOfQuacks;

    public QuackCounter(Quackble duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        this.duck.quack();
        numberOfQuacks ++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
        public void notifyObservers() {
        duck.notifyObservers();
    }
}