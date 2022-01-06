package com.sinosoft.design.factoryDesign.methodFactory;

/**
 * @author: DuJunLiang
 * @date: 2022/1/6 10:30
 * @version: 1.0
 */
public class WeChatSender implements Sender{
    @Override
    public void send() {
        System.out.println("this is wechat message");
    }
}
