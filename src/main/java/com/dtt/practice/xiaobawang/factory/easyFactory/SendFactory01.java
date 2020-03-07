package com.dtt.practice.xiaobawang.factory.easyFactory;


import com.dtt.practice.xiaobawang.factory.MailSender;
import com.dtt.practice.xiaobawang.factory.SMSSender;
import com.dtt.practice.xiaobawang.factory.Sender;

public class SendFactory01 {

    public Sender produce(String type){
        if(type.equals("mail"))
            return new MailSender();
        if(type.equals("sms"))
            return new SMSSender();
        return null;
    }

}
