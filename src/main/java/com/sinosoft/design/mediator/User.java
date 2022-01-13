package com.sinosoft.design.mediator;

/**
 * @author: DuJunLiang
 * @date: 2022/1/13 14:00
 * @version: 1.0
 */
public abstract class User {
    private Mediator mediator;

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
