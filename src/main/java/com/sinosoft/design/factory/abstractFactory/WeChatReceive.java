package com.sinosoft.design.factory.abstractFactory;

/**
 * @author: DuJunLiang
 * @date: 2022/1/6 11:09
 * @version: 1.0
 */
public class WeChatReceive extends Receive{
    @Override
    public void produce() {
        System.out.println("this is wechat receive message");
    }
}
