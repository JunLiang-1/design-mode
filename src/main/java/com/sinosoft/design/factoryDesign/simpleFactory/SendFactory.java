package com.sinosoft.design.factoryDesign.simpleFactory;

/**
 * @author: DuJunLiang
 * @date: 2022/1/6 9:59
 * @version: 1.0
 */
public class SendFactory {
    /**
     * 第一种
     * @param type
     * @return
     */
    public Sender produce(String type) {
        if ("qq".equals(type)) {
            return new QQSender();
        } else if ("wechat".equals(type)) {
            return new WeChatSender();
        } else {
            return null;
        }
    }

    /**
     * 第二种
     * @return
     */
    public Sender produceQQ(){
        return new QQSender();
    }
    public Sender produceWeChat(){
        return new WeChatSender();
    }

    /**
     * 第三种
     * @return
     */
    public static Sender produceQQSender(){
        return new QQSender();
    }
    public static Sender produceWeChatSender(){
        return new WeChatSender();
    }
}
