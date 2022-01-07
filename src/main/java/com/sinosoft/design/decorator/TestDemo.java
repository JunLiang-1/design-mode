package com.sinosoft.design.decorator;

/**
 * @author: DuJunLiang
 * @date: 2022/1/6 16:03
 * @version: 1.0
 */
public class TestDemo {
    public static void main(String[] args) {

        /**
         * 装饰模式：被装饰类（Source）、装饰类（Decorator）
         * 优点：动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删）
         * 缺点：产生过多相似的对象，不易排错！
         */
        Sourceable sourceable = new Source();
        Decorator decorator = new Decorator(sourceable);
        decorator.method();
    }
}
