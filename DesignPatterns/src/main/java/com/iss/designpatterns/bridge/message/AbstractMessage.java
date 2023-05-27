package com.iss.designpatterns.bridge.message;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-05-27 13:24
 **/

public abstract class AbstractMessage {

    private IMessage iMessage;

    public AbstractMessage(IMessage iMessage) {
        this.iMessage = iMessage;
    }

    void sendMessage(String message,String toUser){
        iMessage.send(message, toUser);
    }


}
