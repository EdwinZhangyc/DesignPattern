package com.zyc.Compound.me.combining;

import com.zyc.Compound.me.combining.Observer.Observable;
import com.zyc.Compound.me.combining.Observer.Observer;

public class RubberDuck implements Quackble {

    Observable observable;

    public RubberDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
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