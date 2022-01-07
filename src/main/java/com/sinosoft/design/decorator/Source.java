package com.sinosoft.design.decorator;

/**
 * @author: DuJunLiang
 * @date: 2022/1/6 15:59
 * @version: 1.0
 */
public class Source implements Sourceable{
    @Override
    public void method() {
        System.out.println("this is the Source method");
    }
}
