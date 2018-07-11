package com.zyc.Singleton;

public class Singleton3 {

    private static Singleton3 instance = new Singleton3();

    private Singleton3(){}

    private static Singleton3 getInstance(){

        return instance;
    }
}