package com.iss.designpatterns.delegate;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-05-27 21:44
 **/

public class EmployeeA implements IEmployee{

    @Override
    public void doing(String task) {

        System.out.println("我是员工A，我现在开始干" + task + "工作");

    }
}
