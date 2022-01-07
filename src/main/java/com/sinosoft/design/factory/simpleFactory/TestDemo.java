package com.sinosoft.design.factory.simpleFactory;

/**
 * @author: DuJunLiang
 * @date: 2022/1/6 10:04
 * @version: 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        /**
         * 简单工厂设计模式:缺点传递的字符串出错，则不能正确创建对象
         */
        SendFactory sendFactory = new SendFactory();
        Sender qqSender = sendFactory.produce("qq");
        Sender wechatSender = sendFactory.produce("wechat");
        qqSender.send();
        wechatSender.send();

        /**
         * 改进简单工厂设计模式,由传入相应的方法代替字符串
         */
        SendFactory newSendFactory = new SendFactory();
        Sender qq = newSendFactory.produceQQ();
        Sender wechat = newSendFactory.produceWeChat();
        qq.send();
        wechat.send();

        /**
         * 改进简单工厂设计模式,不需要实例化工厂类,直接进行创建
         */
        Sender staticQQSender = SendFactory.produceQQSender();
        Sender staticWeChatSender = SendFactory.produceWeChatSender();
        staticQQSender.send();
        staticWeChatSender.send();
    }
}
