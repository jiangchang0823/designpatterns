package com.iss.designpatterns.bridge.message;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-05-27 13:21
 **/

public class NormalMessage extends AbstractMessage {

    public NormalMessage(IMessage iMessage) {
        super(iMessage);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "【普通】" + message;
        super.sendMessage(message, toUser);
    }

}
