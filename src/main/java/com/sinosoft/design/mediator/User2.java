package com.sinosoft.design.mediator;

/**
 * @author: DuJunLiang
 * @date: 2022/1/13 14:01
 * @version: 1.0
 */
public class User2 extends User{
    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("this is the user2 work");
    }
}
