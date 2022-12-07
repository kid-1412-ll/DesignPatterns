package com.kindkidll.abstractfactorypattern.simple1;

/**
 * @author leiliang
 * @description
 * @create 2022-11-27 9:39
 */
class ConcreteFactory2 implements AbstractFactory {

    @Override
    public ProductA2 createProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB2 createProductB() {
        return new ProductB2();
    }
}
