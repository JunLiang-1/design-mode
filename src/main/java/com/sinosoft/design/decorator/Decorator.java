package com.sinosoft.design.decorator;

/**
 * @author: DuJunLiang
 * @date: 2022/1/6 15:59
 * @version: 1.0
 */
public class Decorator implements Sourceable {
    private Sourceable sourceable;

    public Decorator(Sourceable sourceable) {
        super();
        this.sourceable = sourceable;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        sourceable.method();
        System.out.println("after decorator!");
    }
}
