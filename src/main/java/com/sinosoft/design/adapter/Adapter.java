package com.sinosoft.design.adapter;

/**
 * @author: DuJunLiang
 * @date: 2022/1/6 14:58
 * @version: 1.0
 */
public class Adapter extends Source implements Targetable{
    @Override
    public void method2() {
        System.out.println("this is Adapter method2");
    }
}
