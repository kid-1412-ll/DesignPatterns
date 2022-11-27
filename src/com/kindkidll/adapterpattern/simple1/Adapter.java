package com.kindkidll.adapterpattern.simple1;

/**
 * @author leiliang
 * @description
 * @create 2022-11-27 11:24
 */
class Adapter extends Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
