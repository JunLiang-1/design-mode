package com.sinosoft.design.factory.abstractFactory;

/**
 * @author: DuJunLiang
 * @date: 2022/1/6 11:10
 * @version: 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        /**
         * 抽象工厂模式:抽象工厂角色（Factory）、具体工厂角色（QQFactory\WeChatFactory）、
         * 抽象产品角色（Sender\Receive）、具体产品角色（QQSender\QQReceive\WeChatSender\WeChatReceive）
         * 工厂方法模式只有一个抽象产品类"发送"，而抽象工厂模式有多个，例如这里的“接收”，“发送”。
         * 工厂方法模式的具体工厂类只能创建一个具体产品类的实例，而抽象工厂模式可以创建多个。
         */
        Factory qqFactroty=new QQFactory();
        Sender qqSender = qqFactroty.getSender();
        Receive qqReceive = qqFactroty.getReceive();
        qqSender.produce();
        qqReceive.produce();
        Factory weChatFactory=new WeChatFactory();
        Sender weChatSender = weChatFactory.getSender();
        Receive weChatReceive = weChatFactory.getReceive();
        weChatSender.produce();
        weChatReceive.produce();
    }
}
