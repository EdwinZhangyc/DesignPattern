package com.zyc.State;

public class StateMachine {

    final static int SOLD_OUT = 0;//售空
    final static int NO_QUARTER = 1;//没钱
    final static int HAS_QUARTER = 2;//有钱
    final static int SOLD = 3;//售卖

    int state = SOLD_OUT;//初始化的机器是售空状态的
    int count = 0;

    public StateMachine(int count){
        this.count = count;
        if (count > 0)
            state = NO_QUARTER;
    }

    public void insertQuarter (){
        if(state == HAS_QUARTER){
            System.out.println("You can't insert other quarter");
        } else if (state == SOLD_OUT){
            System.out.println("You can't insert a quarter, the machine is sold out");
        } else if (state == SOLD){
            System.out.println("Please wait, we're already giving you a gumball");
        } else if (state == NO_QUARTER){
            state = HAS_QUARTER;
            System.out.println("You inserted a quarter");
        }
    }

    public void ejectQuarter(){
        if (state == HAS_QUARTER){
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER){
            System.out.println("You haven't inserted a quarter");
        } else if (state == SOLD){
            System.out.println("Sorry, you already turned the crank");
        } else if (state == SOLD_OUT){
            System.out.println("You can't eject, you haven't inserted a quarter yet");
        }
    }

    public void turnCrank(){
        if (state == SOLD){
            System.out.println("Turning twice doesn't get you another gumball!!");
        } else if (state == NO_QUARTER){
            System.out.println("You turned but there's no quarter");
        } else if (state == SOLD_OUT){
            System.out.println("You turned, but there's no gunballs");
        } else if (state == HAS_QUARTER){
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        }
    }

    private void dispense() {
        if (state == SOLD){
            System.out.println("A gumball comes rolling out the slot");
            count = count -1;
            if (count == 0){
                System.out.println("Oops, out of gunballs");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER){
            System.out.println("You need to pay first");
        } else if (state == SOLD_OUT){
            System.out.println("No gumball dispense");
        } else if (state == HAS_QUARTER){
            System.out.println("No gumball dispense");
        }
    }
}