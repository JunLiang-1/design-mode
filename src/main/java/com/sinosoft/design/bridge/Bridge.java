package com.sinosoft.design.bridge;

/**
 * @author: DuJunLiang
 * @date: 2022/1/7 14:18
 * @version: 1.0
 */
public abstract class Bridge {
    private Source source;

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public void method() {
        source.method();
    }
}
