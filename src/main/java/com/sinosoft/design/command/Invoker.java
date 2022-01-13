package com.sinosoft.design.command;


/**
 * @author: DuJunLiang
 * @date: 2022/1/13 9:18
 * @version: 1.0
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
