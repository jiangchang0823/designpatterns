package com.iss.designpatterns.interrupt;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-06-28 16:21
 **/

public class MyThread extends Thread {

    @Override
    public void run() {
        for(int i=0; i<500000; i++){
            System.out.println("i="+(i+1));
        }
    }

}
