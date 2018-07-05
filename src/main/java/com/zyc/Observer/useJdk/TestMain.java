package com.zyc.Observer.useJdk;

public class TestMain {

    public static void main(String[] args){
        WeatherData subject = new WeatherData();
        CurrentConditionObserver observer = new CurrentConditionObserver(subject);
        subject.setParameter(12,21,31);

    }
}