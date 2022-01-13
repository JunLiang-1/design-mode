package com.sinosoft.design.memento;

/**
 * @author: DuJunLiang
 * @date: 2022/1/13 9:50
 * @version: 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        /**
         * 备忘录模式:
         * Original类是原始类，里面有需要保存的属性value及创建一个备忘录类，用来保存value值。
         * Memento类是备忘录类，
         * Storage类是存储备忘录的类，持有Memento类的实例
         */

        /* 原始类*/
        Oraginal oraginal = new Oraginal("before");

        /* 备份初始值*/
        Memento memento = oraginal.createMemento();
        Storage storage = new Storage(memento);
        System.out.println("初始值:"+oraginal.getValue());

        /* 修改值*/
        oraginal.setValue("after");
        System.out.println("修改后的值:"+oraginal.getValue());

        oraginal.restoreMemento(storage.getMemento());
        System.out.println("备份的值：" + oraginal.getValue());
    }
}
