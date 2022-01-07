package com.sinosoft.design.singleton;

/**
 * @author: DuJunLiang
 * @date: 2022/1/6 14:03
 * @version: 1.0
 */
public class Singleton {
    private static Singleton instance = null;  //持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载

    private Singleton() {
    }         //私有构造方法，防止被实例化

    public static Singleton getInstance() {  //静态工程方法，创建实例
        /**
         * 双重判断应对多线程环境情况，而synchronized关键字也可以加在方法上，但是性能上会有所下降.
         * 因为每次调用getInstance方法都要对对象上锁，事实上，只有在第一次创建对象的时候需要加锁，之后就不需要了，
         * 所以，这个地方把synchronized关键字放在双重判断上。
         */
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public Object readResolve() {   //保证对象在序列化前后保持一致
        return instance;
    }
}
