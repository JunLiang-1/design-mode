package com.sinosoft.design.visitor;

/**
 * @author: DuJunLiang
 * @date: 2022/1/13 11:24
 * @version: 1.0
 */
public class MyVisitor implements Visitor{
    @Override
    public void visit(Subject sub) {
        System.out.println("visit the subject："+sub.getSubject());
    }
}
