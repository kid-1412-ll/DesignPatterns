package com.kindkidll.facadepattern.simple1;

/**
 * @author leiliang
 * @description 外观模式简单实现
 * @create 2022-12-06 19:14
 */
class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.wrapOperation();
    }
}
