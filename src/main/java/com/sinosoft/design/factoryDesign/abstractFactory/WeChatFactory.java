package com.sinosoft.design.factoryDesign.abstractFactory;

/**
 * @author: DuJunLiang
 * @date: 2022/1/6 11:24
 * @version: 1.0
 */
public class WeChatFactory implements Factory {
    @Override
    public Sender getSender() {
        return new WeChatSender();
    }

    @Override
    public Receive getReceive() {
        return new WeChatReceive();
    }
}
