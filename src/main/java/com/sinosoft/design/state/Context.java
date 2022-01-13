package com.sinosoft.design.state;

/**
 * @author: DuJunLiang
 * @date: 2022/1/13 10:11
 * @version: 1.0
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void method() {
        if ("one".equals(state.getValue())) {
            state.method1();
        } else if ("two".equals(state.getValue())) {
            state.method2();
        }
    }
}
