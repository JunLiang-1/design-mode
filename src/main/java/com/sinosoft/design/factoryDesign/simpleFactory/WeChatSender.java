package com.sinosoft.design.factoryDesign.simpleFactory;

/**
 * @author: DuJunLiang
 * @date: 2022/1/6 9:59
 * @version: 1.0
 */
public class WeChatSender implements Sender{
    @Override
    public void send() {
        System.out.println("this is wechat message");
    }
}
