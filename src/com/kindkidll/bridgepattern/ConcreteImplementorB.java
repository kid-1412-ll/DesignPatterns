package com.kindkidll.bridgepattern;

/**
 * @author leiliang
 * @description 具体实现类B
 * @create 2022-12-03 16:04
 */
class ConcreteImplementorB implements Implementor {

    @Override
    public void operationImp() {
        System.out.println(ConcreteImplementorB.class.getName() + ".operationImp()");
    }
}