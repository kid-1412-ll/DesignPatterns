package com.kindkidll.abstractfactorypattern.simple1;

/**
 * @author leiliang
 * @description
 * @create 2022-11-27 9:39
 */
class ConcreteFactory1 implements AbstractFactory {

    @Override
    public ProductA1 createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB1 createProductB() {
        return new ProductB1();
    }
}
