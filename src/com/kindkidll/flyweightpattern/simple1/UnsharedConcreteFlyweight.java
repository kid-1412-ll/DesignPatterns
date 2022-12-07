package com.kindkidll.flyweightpattern.simple1;

/**
 * @author leiliang
 * @description 非共享具体享元类
 * @create 2022-12-07 20:08
 */
class UnsharedConcreteFlyweight implements Flyweight {

    private String intrinsicState = "";

    public UnsharedConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void use(String extrinsicState) {
        System.out.println(intrinsicState + ":" + extrinsicState);
    }
}
