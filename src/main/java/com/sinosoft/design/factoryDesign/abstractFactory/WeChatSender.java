package com.sinosoft.design.factoryDesign.abstractFactory;

/**
 * @author: DuJunLiang
 * @date: 2022/1/6 11:07
 * @version: 1.0
 */
public class WeChatSender extends Sender{
    @Override
    public void produce() {
        System.out.println("this is wechat send message");
    }
}
