package com.sinosoft.design.bridge;

/**
 * @author: DuJunLiang
 * @date: 2022/1/7 14:19
 * @version: 1.0
 */
public class MyBridge extends Bridge{
    @Override
    public void method() {
        getSource().method();
    }
}
