package com.sinosoft.design.template;

/**
 * @author: DuJunLiang
 * @date: 2022/1/11 16:25
 * @version: 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        /**
         * 模板方法模式
         * 抽象类AbstractCalculator定义了被子类重写的方法，子类通过此方法完成对方法的实现
         */
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
