package com.zyc.Observer.useJdk;

import java.util.Observable;

public class WeatherData extends Observable {

    private ParaPojo paraPojo;

    public ParaPojo getParaPojo() {
        return paraPojo;
    }

    public void setParameter(float a, float b, float c){
        this.paraPojo = new ParaPojo();
        this.paraPojo.setTemp(a);
        this.paraPojo.setHumidity(b);
        this.paraPojo.setPressure(c);
        measurementsChanged();
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }
}