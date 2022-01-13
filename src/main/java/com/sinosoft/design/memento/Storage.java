package com.sinosoft.design.memento;

/**
 * @author: DuJunLiang
 * @date: 2022/1/13 9:44
 * @version: 1.0
 */
public class Storage {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Storage(Memento memento) {
        this.memento = memento;
    }
}
