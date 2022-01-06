package com.sinosoft.design.factoryDesign.abstractFactory;

/**
 * @author: DuJunLiang
 * @date: 2022/1/6 11:08
 * @version: 1.0
 */
public class QQReceive extends Receive{
    @Override
    public void produce() {
        System.out.println("this is qq receive message");
    }
}
