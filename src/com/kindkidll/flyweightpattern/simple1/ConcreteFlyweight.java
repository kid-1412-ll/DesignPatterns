package com.kindkidll.flyweightpattern.simple1;

/**
 * @author leiliang
 * @description 具体享元类
 * @create 2022-12-07 19:57
 */
class ConcreteFlyweight implements Flyweight {

    private String intrinsicState = "";

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void use(String extrinsicState) {
        System.out.println(intrinsicState + ":" + extrinsicState);
    }
}
