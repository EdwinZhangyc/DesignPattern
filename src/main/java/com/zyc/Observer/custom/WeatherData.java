package com.zyc.Observer.custom;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List observers = new ArrayList();
    private ParaPojo paraPojo;

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = this.observers.indexOf(observer);
        if (index >= 0)
            this.observers.remove(index);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < this.observers.size(); i++) {
             Observer observer = (Observer) this.observers.get(i);
             observer.update(this.paraPojo);
        }
    }

    public void setParameter(float a, float b, float c){
        this.paraPojo = new ParaPojo();
        this.paraPojo.setTemp(a);
        this.paraPojo.setHumidity(b);
        this.paraPojo.setPressure(c);
        this.notifyObserver();
    }
}