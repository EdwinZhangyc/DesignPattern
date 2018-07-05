package com.zyc.Observer.useJdk;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionObserver implements Observer,Display {

    private ParaPojo paraPojo;
    private Observable weatherData;

    CurrentConditionObserver(Observable obj){
        this.weatherData = obj;
        this.weatherData.addObserver(this);//将自身添加到主题中
    }

    @Override
    public void display() {
        System.out.println(paraPojo.toString());
    }



    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.paraPojo = weatherData.getParaPojo();
            display();
        }
    }
}