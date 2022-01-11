package com.sinosoft.design.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author: DuJunLiang
 * @date: 2022/1/11 16:53
 * @version: 1.0
 */
public abstract class AbstractSubject implements Subject {
    private Vector<Observer> vector = new Vector();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> elements = vector.elements();
        while (elements.hasMoreElements()) {
            elements.nextElement().update();
        }
    }
}
