package com.sinosoft.design.state;

/**
 * @author: DuJunLiang
 * @date: 2022/1/13 10:10
 * @version: 1.0
 */
public class State {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1() {
        System.out.println("this is the State method1");
    }

    public void method2() {
        System.out.println("this is the State method2");
    }
}
