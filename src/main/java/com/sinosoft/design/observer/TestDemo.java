package com.sinosoft.design.observer;

/**
 * @author: DuJunLiang
 * @date: 2022/1/11 17:04
 * @version: 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        /**
         * 观察者模式
         * 当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化！对象之间是一种一对多的关系
         */
        Subject subject = new MySubject();
        subject.add(new Observer1());
        subject.add(new Observer2());
        subject.operation();
    }
}
