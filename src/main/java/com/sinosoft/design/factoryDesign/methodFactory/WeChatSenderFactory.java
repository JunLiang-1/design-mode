package com.sinosoft.design.factoryDesign.methodFactory;

/**
 * @author: DuJunLiang
 * @date: 2022/1/6 10:32
 * @version: 1.0
 */
public class WeChatSenderFactory implements Provider{
    @Override
    public Sender produce() {
        return new WeChatSender();
    }
}
