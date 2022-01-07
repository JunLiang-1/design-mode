package com.sinosoft.design.adapter;

/**
 * @author: DuJunLiang
 * @date: 2022/1/6 15:07
 * @version: 1.0
 */
public class Wrapper implements Targetable{
    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is wrapper method2");
    }
}
