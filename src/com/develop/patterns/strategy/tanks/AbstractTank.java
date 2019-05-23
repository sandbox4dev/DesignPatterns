package com.develop.patterns.strategy.tanks;

import com.develop.patterns.strategy.tanks.behaviour.MovementBehaviour;
import com.develop.patterns.strategy.tanks.behaviour.ShotBehaviour;

public class AbstractTank {
    MovementBehaviour movementBehaviour;
    ShotBehaviour shotBehaviour;

    public void performMovement(){
        movementBehaviour.doMovement();
    }

    public void performShot(){
        shotBehaviour.makeShot();
    }

    public void setFullBehaviour(MovementBehaviour movementBehaviour, ShotBehaviour shotBehaviour){
        this.movementBehaviour = movementBehaviour;
        this.shotBehaviour = shotBehaviour;
    }
}
