package com.sinosoft.design.adapterDesign;

/**
 * @author: DuJunLiang
 * @date: 2022/1/6 14:59
 * @version: 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        /** 类的适配器模式
         *  当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可
         */
        Targetable targetable = new Adapter();
        targetable.method1();
        targetable.method2();

        /** 对象的适配器模式
         *  当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行
         */
        Source source=new Source();
        Targetable newTargetable = new Wrapper(source);
        newTargetable.method1();
        newTargetable.method2();

        /** 接口的适配器模式
         *  当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可
         */
        AbstractWrapper abstractWrapper=new WrapperSub1();
        abstractWrapper.method1();
        AbstractWrapper abstractWrapper2=new WrapperSub2();
        abstractWrapper2.method2();
    }
}
