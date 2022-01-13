package com.sinosoft.design.visitor;

/**
 * @author: DuJunLiang
 * @date: 2022/1/13 11:21
 * @version: 1.0
 */
public class MySubject implements Subject{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "MySubject";
    }
}
