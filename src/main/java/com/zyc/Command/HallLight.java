package com.zyc.Command;

public class HallLight implements Light {
    @Override
    public void on() {
        System.out.println("light is on....");
    }

    @Override
    public void off() {
        System.out.println("light is off....");
    }
}