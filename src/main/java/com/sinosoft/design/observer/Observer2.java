package com.sinosoft.design.observer;

/**
 * @author: DuJunLiang
 * @date: 2022/1/11 16:52
 * @version: 1.0
 */
public class Observer2 implements Observer{
    @Override
    public void update() {
        System.out.println("this is the Observer2 update");
    }
}
