package com.develop.patterns.strategy.tanks.behaviour;

public class TrackedMovement implements MovementBehaviour {
    @Override
    public void doMovement() {
        System.out.println("moves on tracks");
    }
}
