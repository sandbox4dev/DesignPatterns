package com.develop.patterns.strategy.ducks.impl;

import com.develop.patterns.strategy.ducks.Duck;

public class WildDuck implements Duck {
    @Override
    public void swim() {
        System.out.println("Wild duck swimming");
    }

    @Override
    public void fly() {
        System.out.println("Wild duck flying");
    }

    @Override
    public void quack() {
        System.out.println("Wild duck singing");
    }
}
