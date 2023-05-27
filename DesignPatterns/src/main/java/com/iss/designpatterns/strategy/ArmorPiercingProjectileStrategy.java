package com.iss.designpatterns.strategy;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-04-08 18:43
 **/

public class ArmorPiercingProjectileStrategy implements TankStrategy<Tank>{

    @Override
    public void fillCannonball() {
        System.out.println("this is ArmorPiercingProjectile");
    }
}
