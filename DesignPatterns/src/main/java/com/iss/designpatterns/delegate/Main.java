package com.iss.designpatterns.delegate;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-05-27 21:56
 **/

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("架构", new Leader());
    }
}
