package com.iss.designpatterns.strategy;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-04-08 18:24
 **/

public class Tank {

    public void fire(TankStrategy<Tank> tankStrategy){
        tankStrategy.fillCannonball();
    }

    public static void main(String[] args) {
        Tank tank = new Tank();
        ArmorPiercingProjectileStrategy armorPiercingProjectileStrategy = new ArmorPiercingProjectileStrategy();
        tank.fire(armorPiercingProjectileStrategy);
    }

}
