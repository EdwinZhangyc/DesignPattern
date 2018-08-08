package com.zyc.Compound.me.combining.Observer;

import com.zyc.Compound.me.combining.*;

public class DuckSimulate {

    public static void main (String[] args) {

        DuckSimulate duckSimulate = new DuckSimulate();
        AbstructDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulate.simulate(duckFactory);
    }

    private void simulate(AbstructDuckFactory duckFactory) {

        Quackble duckCall = duckFactory.createDuckCall();
        Quackble redheadDuck = duckFactory.createRedheadDuck();
        Quackble rubberDuck = duckFactory.createRubberDuck();
        Quackble gooseDuck = new GooseAdapter(new Goose());

        Flock flockOfDuck = new Flock();
        flockOfDuck.add(duckCall);
        flockOfDuck.add(redheadDuck);
        flockOfDuck.add(rubberDuck);
        flockOfDuck.add(gooseDuck);

        Flock flockOfMallardDuck = new Flock();
        Quackble mallardDuck1 = duckFactory.createMallarDuck();
        Quackble mallardDuck2 = duckFactory.createMallarDuck();
        Quackble mallardDuck3 = duckFactory.createMallarDuck();
        Quackble mallardDuck4 = duckFactory.createMallarDuck();
        flockOfMallardDuck.add(mallardDuck1);
        flockOfMallardDuck.add(mallardDuck2);
        flockOfMallardDuck.add(mallardDuck3);
        flockOfMallardDuck.add(mallardDuck4);

        flockOfDuck.add(flockOfMallardDuck);

        System.out.println("\nDuck Simulator: with observer");
        Quackologist quackologist = new Quackologist();
        flockOfDuck.registerObserver(quackologist);
        simulate(flockOfDuck);

        System.out.println("Duck total quack count: " + QuackCounter.getNumberOfQuacks());
    }

    private void simulate(Quackble duckCall) {
        duckCall.quack();
    }
}