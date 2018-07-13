package com.zyc.Adapter;

public class ThurkeyInstance implements Turkey {
    @Override
    public void fly() {

        System.out.println("Thurkey Fly");
    }

    @Override
    public void gobble() {

        System.out.println("Thurkey gobble");
    }
}