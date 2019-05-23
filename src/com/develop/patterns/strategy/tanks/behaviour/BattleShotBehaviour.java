package com.develop.patterns.strategy.tanks.behaviour;

public class BattleShotBehaviour implements ShotBehaviour {
    @Override
    public void makeShot() {
        System.out.println("Bang-bang you died");
    }
}
