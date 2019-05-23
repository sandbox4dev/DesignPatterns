package com.develop.patterns.strategy.ducks.test;

import com.develop.patterns.strategy.ducks.Duck;
import com.develop.patterns.strategy.ducks.impl.WildDuck;

public class DucksTest {
    public static void main(String[] args) {
        Duck duck = new WildDuck();
        duck.fly();
    }
}
