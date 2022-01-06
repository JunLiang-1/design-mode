package com.sinosoft.design.factoryDesign.abstractFactory;

/**
 * @author: DuJunLiang
 * @date: 2022/1/6 11:23
 * @version: 1.0
 */
public class QQFactory implements Factory {
    @Override
    public Sender getSender() {
        return new QQSender();
    }

    @Override
    public Receive getReceive() {
        return new QQReceive();
    }
}
