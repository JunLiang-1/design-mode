package com.sinosoft.design.iterator;

/**
 * @author: DuJunLiang
 * @date: 2022/1/12 15:02
 * @version: 1.0
 */
public interface Iterator {
    //前移
    public Object previous();

    //后移
    public Object next();

    public boolean hasNext();

    //取得第一个元素
    public Object first();
}
