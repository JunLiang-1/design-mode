package com.sinosoft.design.interpreter;

/**
 * @author: DuJunLiang
 * @date: 2022/1/13 14:19
 * @version: 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        /**
         * 解释器模式
         */
        /* 计算9+2-8的值 */
        Context context1 = new Context(9, 2);
        int interpret = new Plus().interpret(context1);

        Context context2 = new Context(interpret, 8);
        int result = new Minus().interpret(context2);

        System.out.println(result);
    }
}
