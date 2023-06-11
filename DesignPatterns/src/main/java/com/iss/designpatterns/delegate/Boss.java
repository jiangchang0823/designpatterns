package com.iss.designpatterns.delegate;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-05-27 21:46
 **/

public class Boss {

    public void command(String task, Leader leader) {
        leader.doing(task);
    }

}
