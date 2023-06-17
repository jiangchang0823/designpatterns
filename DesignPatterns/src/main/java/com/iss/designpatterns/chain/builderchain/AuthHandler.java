package com.iss.designpatterns.chain.builderchain;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-06-11 11:10
 **/

@Slf4j
public class AuthHandler extends Handler<Member> {

    @Override
    public void doHandler(Member member) {
        if (!"管理员".equals(member.getRole())) {
            System.out.println("您不是管理员，没有操作权限");
            return;
        }
        log.info("您是管理员，可以继续操作");
    }
}
