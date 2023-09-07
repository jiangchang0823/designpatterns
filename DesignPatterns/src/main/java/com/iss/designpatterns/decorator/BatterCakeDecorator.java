package com.iss.designpatterns.decorator;

/**
 * @author VODE CODC
 * @description TODO
 * @create 2023-08-26 23:14
 **/

public class BatterCakeDecorator extends BatterCake {

    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    protected String getMsg() {
        return batterCake.getName();
    }

    // protected int getPrice() {
        // Integer.valueOf()
        // return batterCake.getPrice();
    // }


}
