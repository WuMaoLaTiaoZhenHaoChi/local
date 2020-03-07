package com.dtt.practice.xiaobawang.factory.moreStaticFactory02;


import com.dtt.practice.xiaobawang.factory.MailSender;
import com.dtt.practice.xiaobawang.factory.SMSSender;
import com.dtt.practice.xiaobawang.factory.Sender;

/**
 * @Author: DuanTong
 * @Date: 2019/7/28 10:49
 */
public class StaticFactory {

    public static Sender productSMS(){
        return new SMSSender();
    }

    public static Sender productMail(){
        return new MailSender();
    }

}
