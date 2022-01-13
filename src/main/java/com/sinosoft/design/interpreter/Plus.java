package com.sinosoft.design.interpreter;

/**
 * @author: DuJunLiang
 * @date: 2022/1/13 14:18
 * @version: 1.0
 */
public class Plus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1() + context.getNum2();
    }
}
