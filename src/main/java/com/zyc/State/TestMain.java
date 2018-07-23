package com.zyc.State;

public class TestMain {

    public static void main (String[] args){

        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println();
    }
}