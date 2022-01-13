package com.sinosoft.design.command;

/**
 * @author: DuJunLiang
 * @date: 2022/1/13 9:21
 * @version: 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        /**
         * 命令模式:Invoker(命令发出者)、Recevier(命令接收者)、MyCommand(传令者)
         * 命令的发出者和执行者之间解耦，实现请求和执行分开
         */
        Recevier recevier = new Recevier();
        Command command = new MyCommand(recevier);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
