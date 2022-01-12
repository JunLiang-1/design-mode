package com.sinosoft.design.chain;

/**
 * @author: DuJunLiang
 * @date: 2022/1/12 15:14
 * @version: 1.0
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
