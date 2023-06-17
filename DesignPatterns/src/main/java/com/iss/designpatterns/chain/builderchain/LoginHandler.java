package com.iss.designpatterns.chain.builderchain;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-06-11 11:05
 **/

@Slf4j
public class LoginHandler extends Handler<Member> {

    @Override
    public void doHandler(Member member) {
        log.info("登录成功");
        member.setRole("管理员");
        if (this.next != null) {
            this.next.doHandler(member);
        }
    }
}
