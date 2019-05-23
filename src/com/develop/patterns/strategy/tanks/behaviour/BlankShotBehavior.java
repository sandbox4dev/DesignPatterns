package com.develop.patterns.strategy.tanks.behaviour;

public class BlankShotBehavior implements ShotBehaviour {
    @Override
    public void makeShot() {
        System.out.println("Piu-piu you alive");
    }
}
