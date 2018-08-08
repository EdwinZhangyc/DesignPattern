package com.zyc.Compound.me.combining;

import com.zyc.Compound.me.combining.Observer.Observable;
import com.zyc.Compound.me.combining.Observer.Observer;

public class MallardDuck implements Quackble {

    Observable observable;

    public MallardDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}