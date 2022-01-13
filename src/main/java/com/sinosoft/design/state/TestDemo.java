package com.sinosoft.design.state;

/**
 * @author: DuJunLiang
 * @date: 2022/1/13 10:16
 * @version: 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        /**
         * 状态模式
         */
        State state = new State();
        Context context=new Context(state);
        state.setValue("one");
        context.method();
        state.setValue("two");
        context.method();
    }
}
