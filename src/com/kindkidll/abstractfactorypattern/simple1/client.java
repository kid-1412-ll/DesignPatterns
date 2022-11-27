package com.kindkidll.abstractfactorypattern.simple1;

/**
 * @author leiliang
 * @description 抽象工厂模式简单实现
 * @create 2022-11-27 9:49
 */
class client {

    public static void main(String[] args) {
        AbstractFactory factory;
        AbstractProductA productA;
        AbstractProductB productB;

        //可用反射+配置文件优化
        factory = new ConcreteFactory1();
        productA = factory.createProductA();
        productB = factory.createProductB();
        productA.use();
        productB.eat();

        factory = new ConcreteFactory2();
        productA = factory.createProductA();
        productB = factory.createProductB();
        productA.use();
        productB.eat();
    }
}
