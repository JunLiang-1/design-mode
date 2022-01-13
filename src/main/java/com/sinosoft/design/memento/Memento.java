package com.sinosoft.design.memento;

/**
 * @author: DuJunLiang
 * @date: 2022/1/13 9:43
 * @version: 1.0
 */
public class Memento {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memento(String value) {
        this.value = value;
    }
}
