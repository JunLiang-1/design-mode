package com.sinosoft.design.factoryDesign.methodFactory;

/**
 * @author: DuJunLiang
 * @date: 2022/1/6 10:33
 * @version: 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        /**
         * 工厂方法模式:
         * 简单工厂模式有一个问题就是,类的创建依赖工厂类,而工厂方法模式,创建一个工厂接口和创建多个工厂实现类,
         * 这样一旦需要增加新的功能,直接增加新的工厂类就可以了,不需要修改之前的代码,可拓展性强
         */
        Provider qqProvider=new QQSenderFactory();
        Provider weChatprovider= new WeChatSenderFactory();
        Sender qqProduce = qqProvider.produce();
        Sender weChatProduce = weChatprovider.produce();
        qqProduce.send();
        weChatProduce.send();
    }
}
