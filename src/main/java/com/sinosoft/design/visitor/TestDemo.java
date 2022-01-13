package com.sinosoft.design.visitor;

/**
 * @author: DuJunLiang
 * @date: 2022/1/13 11:27
 * @version: 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        /**
         * 访问者模式
         * 适用场景：如果我们想为一个现有的类增加新功能，不得不考虑几个事情：
         * 1、新功能会不会与现有功能出现兼容性问题？2、以后会不会再需要添加？3、如果类不允许修改代码怎么办？
         * 访问者模式适用于数据结构相对稳定的系统，把数据结构和算法解耦，
         */
        Visitor visitor = new MyVisitor();
        Subject subject = new MySubject();
        subject.accept(visitor);
    }
}
