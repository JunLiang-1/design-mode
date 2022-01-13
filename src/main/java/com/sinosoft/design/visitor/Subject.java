package com.sinosoft.design.visitor;

/**
 * @author: DuJunLiang
 * @date: 2022/1/13 11:20
 * @version: 1.0
 */
public interface Subject {
    void accept(Visitor visitor);

    String getSubject();
}
