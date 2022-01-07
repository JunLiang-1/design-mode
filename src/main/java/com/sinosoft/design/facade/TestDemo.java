package com.sinosoft.design.facade;

/**
 * @author: DuJunLiang
 * @date: 2022/1/7 14:05
 * @version: 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        /**
         * 外观模式：对类之间的关系进行解耦，降低类与类之间的依赖
         */
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
