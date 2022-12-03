package com.kindkidll.bridgepattern;

/**
 * @author leiliang
 * @description 具体实现类A
 * @create 2022-12-03 16:03
 */
class ConcreteImplementorA implements Implementor {

    @Override
    public void operationImp() {
        System.out.println(ConcreteImplementorA.class.getName() + ".operationImp()");
    }
}
