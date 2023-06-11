package com.iss.designpatterns.delegate;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-05-27 21:43
 **/

public class Leader implements IEmployee{

    @Override
    public void doing(String task) {

        // 根据任务分发给具体的员工
        if ("加密".equals(task)) {
            new EmployeeA().doing(task);
        } else if ("架构".equals(task)) {
            new EmployeeB().doing(task);
        } else {
            System.out.println("这个任务" + task + "超出我的能力范围");
        }

    }
}
