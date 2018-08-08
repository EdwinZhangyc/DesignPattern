package com.zyc.Compound.me.combining;

public class CountingDuckFactory extends AbstructDuckFactory {
    @Override
    public Quackble createMallarDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackble createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackble createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackble createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}