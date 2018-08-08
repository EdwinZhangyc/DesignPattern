package com.zyc.Compound.me.combining;

public class DuckFactory extends AbstructDuckFactory {
    @Override
    public Quackble createMallarDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackble createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackble createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackble createRubberDuck() {
        return new RubberDuck();
    }
}