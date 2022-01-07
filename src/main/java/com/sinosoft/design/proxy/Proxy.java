package com.sinosoft.design.proxy;

/**
 * @author: DuJunLiang
 * @date: 2022/1/7 10:11
 * @version: 1.0
 */
public class Proxy implements Sourceable {
    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    public void before() {
        System.out.println("this is the proxy before");
    }

    public void after() {
        System.out.println("this is the proxy after");
    }
}
