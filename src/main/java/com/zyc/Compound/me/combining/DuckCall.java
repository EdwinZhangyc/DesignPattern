package com.zyc.Compound.me.combining;

import com.zyc.Compound.me.combining.Observer.Observable;
import com.zyc.Compound.me.combining.Observer.Observer;

public class DuckCall implements Quackble {

    Observable observable;

    public DuckCall() {
        this.observable = new Observable(this);
        notifyObservers();
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
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