package com.sinosoft.design.iterator;


/**
 * @author: DuJunLiang
 * @date: 2022/1/12 15:02
 * @version: 1.0
 */
public interface Collection {
    public Iterator iterator();

    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int size();
}
