package com.sinosoft.design.factory.methodFactory;

/**
 * @author: DuJunLiang
 * @date: 2022/1/6 10:29
 * @version: 1.0
 */
public class QQSender implements Sender{
    @Override
    public void send() {
        System.out.println("this is qq message");
    }
}
