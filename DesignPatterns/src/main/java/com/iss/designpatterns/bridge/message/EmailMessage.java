package com.iss.designpatterns.bridge.message;

import lombok.extern.slf4j.Slf4j;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-05-27 13:15
 **/

@Slf4j
public class EmailMessage implements IMessage {

    @Override
    public void send(String message, String toUser) {
        log.info("使用邮件发送消息：{},给接收人：{}", message, toUser);

    }

    // 快排

}
