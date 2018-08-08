package com.zyc.Observer.useJdk;

import java.util.Observable;

public class WeatherData extends Observable {

    private ParaPojo paraPojo;

    private float a;

    private float b;

    public ParaPojo getParaPojo() {
        return paraPojo;
    }

    public void setParameter(float a, float b, float c){
        this.paraPojo = new ParaPojo();
        this.paraPojo.setTemp(a);
        this.paraPojo.setHumidity(b);
        this.paraPojo.setPressure(c);
        this.a = a;
        this.b = b;
        measurementsChanged();
    }

    public void measurementsChanged(){

        setChanged();//执行该方法才能进行通知，作用是可以进行判断筛选，例如只有达到某种条件才执行通知

        //以下两种方法使用场景，当“观察者”之间想要得到的不一致时，可以采取拉数据的方式，当数据一致时，采用推数据。
        notifyObservers();//当“观察者”向“可观察者”拉数据时，该方法无参
        notifyObservers(paraPojo);//当“可观察者”向“观察者”推送数据时填入参数
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }
}