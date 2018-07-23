package com.zyc.State.init;

public class TestMain {

    public static void main (String[] args){

        StateMachine stateMachine = new StateMachine(5);
        stateMachine.insertQuarter();
        stateMachine.turnCrank();
        System.out.println(stateMachine);
        stateMachine.insertQuarter();
        stateMachine.ejectQuarter();
        stateMachine.turnCrank();
        System.out.println(stateMachine);

    }
}