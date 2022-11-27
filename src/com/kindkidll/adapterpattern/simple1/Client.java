package com.kindkidll.adapterpattern.simple1;

/**
 * @author leiliang
 * @description 适配器模式简单实现
 * @create 2022-11-27 11:20
 */
class Client {

    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.request();
    }
}
