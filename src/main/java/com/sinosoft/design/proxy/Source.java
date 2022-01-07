package com.sinosoft.design.proxy;

/**
 * @author: DuJunLiang
 * @date: 2022/1/7 10:11
 * @version: 1.0
 */
public class Source implements Sourceable{
    @Override
    public void method() {
        System.out.println("this is the Source method");
    }
}
