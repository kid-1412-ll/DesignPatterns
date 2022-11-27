package com.kindkidll.adapterpattern.simple1;

/**
 * @author leiliang
 * @description
 * @create 2022-11-27 11:24
 */
class Adaptee {

    public void specificRequest() {
        System.out.println(Adaptee.class.getName() + ".specificRequest()");
    }
}
