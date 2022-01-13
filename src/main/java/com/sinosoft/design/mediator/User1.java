package com.sinosoft.design.mediator;

/**
 * @author: DuJunLiang
 * @date: 2022/1/13 14:01
 * @version: 1.0
 */
public class User1 extends User{
    public User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("this is the user1 work");
    }
}
