package com.sinosoft.design.proxy;

/**
 * @author: DuJunLiang
 * @date: 2022/1/7 10:14
 * @version: 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        /**
         * 代理模式
         */
        Sourceable sourceable=new Proxy();
        sourceable.method();
    }
}
