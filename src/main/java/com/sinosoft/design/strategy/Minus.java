package com.sinosoft.design.strategy;

/**
 * @author: DuJunLiang
 * @date: 2022/1/11 16:05
 * @version: 1.0
 */
public class Minus extends AbstractCalculator implements ICalculator{
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"-");
        return arrayInt[0]-arrayInt[1];
    }
}
