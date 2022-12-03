package com.kindkidll.bridgepattern;

/**
 * @author leiliang
 * @description 扩充抽象类
 * @create 2022-12-03 16:07
 */
class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println(RefinedAbstraction.class.getName() + ".operation()");
        super.operation();
    }
}
