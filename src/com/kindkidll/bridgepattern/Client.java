package com.kindkidll.bridgepattern;

/**
 * @author leiliang
 * @description 桥接模式简单实现
 * @create 2022-12-03 15:58
 */
class Client {

    public static void main(String[] args) {
        RefinedAbstraction abstraction = new RefinedAbstraction(new ConcreteImplementorA());
        abstraction.operation();

        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();
    }
}
