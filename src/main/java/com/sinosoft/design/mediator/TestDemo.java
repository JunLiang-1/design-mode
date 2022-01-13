package com.sinosoft.design.mediator;

/**
 * @author: DuJunLiang
 * @date: 2022/1/13 14:06
 * @version: 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        /**
         * 中介者模式
         */
        Mediator mediator=new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
