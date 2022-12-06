package com.kindkidll.facadepattern.simple1;

/**
 * @author leiliang
 * @description
 * @create 2022-12-06 19:17
 */
class Facade {

    private SystemA systemA;
    private SystemB systemB;
    private SystemC systemC;

    public Facade() {
        this.systemA = new SystemA();
        this.systemB = new SystemB();
        this.systemC = new SystemC();
    }

    public void wrapOperation() {
        systemA.operationA();
        systemB.operationB();
        systemC.operationC();
    }
}
