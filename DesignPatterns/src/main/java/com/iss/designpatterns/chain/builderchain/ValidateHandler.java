package com.iss.designpatterns.chain.builderchain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ObjectUtils;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-06-11 11:01
 **/

@Slf4j
public class ValidateHandler extends Handler<Member> {

    @Override
    public void doHandler(Member member) {
        System.out.println("MemberExistHandler");
        if (ObjectUtils.isEmpty(member.getUsername()) || ObjectUtils.isEmpty(member.getPassword())) {
            log.info("用户名或密码为空");
            return;
        }
        log.info("用户名密码不为空，可以继续操作");
        if (this.next != null) {
            this.next.doHandler(member);
        }
    }
}
