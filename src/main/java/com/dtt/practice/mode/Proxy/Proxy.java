package com.dtt.practice.mode.Proxy;


import com.dtt.practice.mode.Decorator.Source;
import com.dtt.practice.mode.Decorator.Sourceable;

/**
 * @Author: DuanTong
 * @Date: 2019/8/28 19:31
 */
public class Proxy implements Sourceable {

    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    public void before(){
        System.out.println("before ...");
    }

    public void after(){
        System.out.println("after ...");
    }

}
