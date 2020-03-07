package com.dtt.practice.xiaobawang.unit;

import com.dtt.practice.xiaobawang.factory.Sender;
import com.dtt.practice.xiaobawang.factory.moreFactory01.SendFactory02;
import org.junit.Test;


public class SendFactory02Test {

    @Test
    public void produce() {

        SendFactory02 sendFactory02 = new SendFactory02();
        Sender sender = sendFactory02.productSMS();
        sender.send();

    }

}
