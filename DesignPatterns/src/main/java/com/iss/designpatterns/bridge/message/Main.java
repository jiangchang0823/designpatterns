package com.iss.designpatterns.bridge.message;

/**
 * @description: TODO
 * @author: VODE CODC
 * @create: 2023-05-27 13:29
 **/

public class Main {

    public static void main(String[] args) {
        IMessage smsMessage = new SmsMessage();
        UrgencyMessage urgencyMessage = new UrgencyMessage(smsMessage);
        urgencyMessage.sendMessage("加班申请", "张三");


        IMessage emailMessage = new EmailMessage();
        NormalMessage normalMessage = new NormalMessage(emailMessage);
        normalMessage.sendMessage("加班申请", "张三");

    }


}
