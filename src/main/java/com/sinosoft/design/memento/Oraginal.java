package com.sinosoft.design.memento;

/**
 * @author: DuJunLiang
 * @date: 2022/1/13 9:45
 * @version: 1.0
 */
public class Oraginal {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Oraginal(String value) {
        this.value = value;
    }

    public Memento createMemento() {
        return new Memento(value);
    }

    public void restoreMemento(Memento memento) {
        this.value = memento.getValue();
    }
}
