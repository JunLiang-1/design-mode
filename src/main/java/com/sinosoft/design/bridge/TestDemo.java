package com.sinosoft.design.bridge;

/**
 * @author: DuJunLiang
 * @date: 2022/1/7 14:22
 * @version: 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        /**
         * 桥接模式
         * 将抽象化与实现化解耦，使得二者可以独立变化，参考例子如数据库连接实例（mysql\Oracle）与连接驱动（DriverMannager）的关系
         */
        Bridge bridge = new MyBridge();

        /*调用第一个对象*/
        Source source1 = new SourceSub1();
        bridge.setSource(source1);
        bridge.method();

        /*调用第二个对象*/
        Source source2 = new SourceSub2();
        bridge.setSource(source2);
        bridge.method();
    }
}
