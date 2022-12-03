package com.kindkidll.bridgepattern;

/**
 * @author leiliang
 * @description 抽象类
 * @create 2022-12-03 15:59
 */
abstract class Abstraction {

    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operationImp();
    }
}
