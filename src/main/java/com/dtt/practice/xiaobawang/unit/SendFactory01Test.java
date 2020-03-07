package com.dtt.practice.xiaobawang.unit;


import com.dtt.practice.xiaobawang.factory.Sender;
import com.dtt.practice.xiaobawang.factory.easyFactory.SendFactory01;

public class SendFactory01Test {

    @org.junit.Test
    public void produce() {
        SendFactory01 sendFactory = new SendFactory01();
        System.out.println("----------");
        Sender sender = sendFactory.produce("mail");
        sender.send();
    }
}
