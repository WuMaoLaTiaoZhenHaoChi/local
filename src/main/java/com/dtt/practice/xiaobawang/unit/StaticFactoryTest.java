package com.dtt.practice.xiaobawang.unit;


import com.dtt.practice.xiaobawang.factory.Sender;
import com.dtt.practice.xiaobawang.factory.moreStaticFactory02.StaticFactory;
import org.junit.Test;


/**
 * @Author: DuanTong
 * @Date: 2019/7/28 10:53
 */
public class StaticFactoryTest {

    @Test
    public void staticFactory(){
        Sender sender = StaticFactory.productMail();
        sender.send();
    }

}
