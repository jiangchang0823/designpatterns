package com.iss.designpatterns.bridge.message;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-05-27 13:21
 **/

public class UrgencyMessage extends AbstractMessage {

    public UrgencyMessage(IMessage iMessage) {
        super(iMessage);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "【加急】" + message;
        super.sendMessage(message, toUser);
    }

}
