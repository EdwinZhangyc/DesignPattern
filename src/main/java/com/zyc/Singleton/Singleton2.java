package com.zyc.Singleton;

public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2(){}

    private static synchronized Singleton2 getInstance(){

        if (instance == null)
            instance = new Singleton2();
        return instance;
    }
}