package com.sinosoft.design.mediator;

/**
 * @author: DuJunLiang
 * @date: 2022/1/13 14:03
 * @version: 1.0
 */
public class MyMediator implements Mediator {
    private User1 user1;
    private User2 user2;

    @Override
    public void createMediator() {
        user1 = new User1(this);
        user2 = new User2(this);
    }

    @Override
    public void workAll() {
        user1.work();
        user2.work();
    }
}
