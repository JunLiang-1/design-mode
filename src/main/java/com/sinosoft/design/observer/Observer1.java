package com.sinosoft.design.observer;

/**
 * @author: DuJunLiang
 * @date: 2022/1/11 16:52
 * @version: 1.0
 */
public class Observer1 implements Observer{
    @Override
    public void update() {
        System.out.println("this is the Observer1 update");
    }
}
