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


    /**
     * 接受数据的方法，该实例表示去“可观察者”中取数据
     * @param o
     *      将“可观察者”对象透传过来，好让“观察者”知道是哪个“可观察者”通知它的。
     * @param arg
     *      当“可观察者”推数据时该入参才有值，当“观察者”向“可观察者”中取数据时无值
     */
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.paraPojo = weatherData.getParaPojo();
            display();
        }
    }
}