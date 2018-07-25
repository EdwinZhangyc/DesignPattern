package com.zyc.Proxy.RemoteProxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    State soldOutState;//售空
    State noQuarterState;//没钱
    State hasQuarterState;//有钱
    State soldState;//售卖
    State winnerState;//赢家

    State state = noQuarterState;//初始化的机器是售空状态的
    int count = 0;
    String location;

    public GumballMachine(String location, int numberGumballs) throws RemoteException {

        this.location = location;
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0)
            state = noQuarterState;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuater();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0)
            count = count - 1;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}