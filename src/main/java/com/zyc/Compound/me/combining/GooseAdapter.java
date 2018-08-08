package com.zyc.Compound.me.combining;

import com.zyc.Compound.me.combining.Observer.Observer;

public class GooseAdapter implements Quackble {

    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        this.goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}