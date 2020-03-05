package com.dtt.xbw.xiaobawang.factory;

public class SMSSender implements Sender {

    @Override
    public void send() {
        System.out.println("this is sms send!!!");
    }

}
