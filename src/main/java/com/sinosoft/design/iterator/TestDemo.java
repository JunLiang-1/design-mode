package com.sinosoft.design.iterator;

/**
 * @author: DuJunLiang
 * @date: 2022/1/12 15:05
 * @version: 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        /**
         * 迭代子模式
         */
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
