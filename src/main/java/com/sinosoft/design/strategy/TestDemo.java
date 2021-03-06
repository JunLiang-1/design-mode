package com.sinosoft.design.strategy;

/**
 * @author: DuJunLiang
 * @date: 2022/1/11 16:07
 * @version: 1.0
 */
public class TestDemo {
    public static void main(String[] args) {
        /**
         * 策略模式
         * 决定权在用户，系统本身提供不同算法的实现，新增或者删除算法，对各种算法做封装。因此，策略模式多用在算法决策系统中，外部用户只需要决定用哪个算法即可。
         */
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
