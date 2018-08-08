package com.zyc.Compound.me.combining;

import com.zyc.Compound.me.combining.Observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackble {

    List<Quackble> quackers = new ArrayList<Quackble>();

    public void add(Quackble quackble){
        quackers.add(quackble);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()){
            Quackble quacker = (Quackble)iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackble> iterator = quackers.iterator();
        while (iterator.hasNext()){
            Quackble quackble = (Quackble)iterator.next();
            quackble.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
    }

    public String toString() {
        return "Flock of Ducks";
    }
}