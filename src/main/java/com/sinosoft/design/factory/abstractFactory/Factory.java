package com.sinosoft.design.factory.abstractFactory;


/**
 * @author: DuJunLiang
 * @date: 2022/1/6 10:58
 * @version: 1.0
 */
public interface Factory {
    Sender getSender();

    Receive getReceive();
}
