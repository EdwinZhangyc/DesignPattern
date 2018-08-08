package com.zyc.Compound.me.combining;

import com.zyc.Compound.me.combining.Observer.Observer;

public interface QuackObservable {

    public void registerObserver(Observer observer);
    public void notifyObservers();
}