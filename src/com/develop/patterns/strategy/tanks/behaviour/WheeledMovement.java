package com.develop.patterns.strategy.tanks.behaviour;

public class WheeledMovement implements MovementBehaviour {
    @Override
    public void doMovement() {
        System.out.println("moves on wheels");
    }
}
