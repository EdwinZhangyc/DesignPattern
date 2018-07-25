package com.zyc.Proxy.RemoteProxy;

public class SoldOutState implements State {

    transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("This gumball is null, you don't insert quarter");
    }

    @Override
    public void ejectQuater() {
        System.out.println("Sorry, this gumball is null");
    }

    @Override
    public void turnCrank() {
        System.out.println("This gunball is null");
    }

    @Override
    public void dispense() {
        System.out.println("This gunball is null");
    }
}