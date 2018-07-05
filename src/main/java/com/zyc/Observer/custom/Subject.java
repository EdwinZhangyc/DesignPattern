package com.zyc.Observer.custom;

//主题接口
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
