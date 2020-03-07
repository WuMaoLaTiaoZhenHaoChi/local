package com.dtt.practice.xiaobawang.factory.moreFactory01;


import com.dtt.practice.xiaobawang.factory.MailSender;
import com.dtt.practice.xiaobawang.factory.SMSSender;
import com.dtt.practice.xiaobawang.factory.Sender;

public class SendFactory02 {

    public Sender productSMS(){
        return new SMSSender();
    }

    public Sender productMail(){
        return new MailSender();
    }

}
