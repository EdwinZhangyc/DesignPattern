package com.zyc.Observer.custom;

public class CurrentConditionObserver implements Observer,Display {

    private ParaPojo paraPojo;
    private Subject weatherData;

    CurrentConditionObserver(Subject obj){
        this.weatherData = obj;
        this.weatherData.registerObserver(this);//将自身添加到主题中
    }

    @Override
    public void display() {
        System.out.println(paraPojo.toString());
    }

    @Override
    public void update(Object obj) {
        this.paraPojo = (ParaPojo)obj;
        display();
    }
}