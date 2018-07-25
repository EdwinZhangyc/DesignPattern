package com.zyc.Proxy.RemoteProxy;

public class WinnerState implements State {

    GumballMachine gumballMachine;
    public WinnerState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Warning");
    }

    @Override
    public void ejectQuater() {
        System.out.println("Warning");
    }

    @Override
    public void turnCrank() {
        System.out.println("Warning");
    }

    @Override
    public void dispense() {
        System.out.println("You are win! you get two gunballs for your quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.count == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.count > 0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}