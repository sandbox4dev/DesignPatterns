package com.develop.patterns.strategy.tanks.test;

import com.develop.patterns.strategy.tanks.AbstractTank;
import com.develop.patterns.strategy.tanks.Tank;
import com.develop.patterns.strategy.tanks.TrackedBattleTank;
import com.develop.patterns.strategy.tanks.behaviour.BattleShotBehaviour;
import com.develop.patterns.strategy.tanks.behaviour.TrackedMovement;

public class TankTest {
    public static void main(String[] args) {
        AbstractTank abs = new TrackedBattleTank();
        abs.setFullBehaviour(new TrackedMovement(),new BattleShotBehaviour());
        abs.performMovement();
        abs.performShot();
    }
}
