package com.zyc.Compound.me.combining.Observer;

import com.zyc.Compound.me.combining.QuackObservable;

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable quackObservable) {
        System.out.println("Quackologist: " + quackObservable + " just quacked.");
    }
}