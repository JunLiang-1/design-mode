package com.sinosoft.design.observer;

/**
 * @author: DuJunLiang
 * @date: 2022/1/11 16:59
 * @version: 1.0
 */
public class MySubject extends AbstractSubject{

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
