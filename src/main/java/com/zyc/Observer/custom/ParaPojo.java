package com.zyc.Observer.custom;

public class ParaPojo {

    private float temp;
    private float humidity;
    private float pressure;

    @Override
    public String toString() {
        return "ParaPojo{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}