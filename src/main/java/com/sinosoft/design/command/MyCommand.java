package com.sinosoft.design.command;

/**
 * @author: DuJunLiang
 * @date: 2022/1/13 9:16
 * @version: 1.0
 */
public class MyCommand implements Command{
    private Recevier recevier;

    public MyCommand(Recevier recevier) {
        this.recevier = recevier;
    }

    @Override
    public void exe() {
        recevier.action();
    }
}
