package com.sinosoft.design.chain;

/**
 * @author: DuJunLiang
 * @date: 2022/1/12 15:18
 * @version: 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        /**
         * 责任链模式
         * 在一个时刻，命令只允许由一个对象传给另一个对象，而不允许传给多个对象
         */
        MyHandler myHandler1 = new MyHandler("chain1");
        MyHandler myHandler2 = new MyHandler("chain2");
        MyHandler myHandler3 = new MyHandler("chain3");

        myHandler1.setHandler(myHandler2);
        myHandler2.setHandler(myHandler3);
        myHandler1.operator();
    }
}
