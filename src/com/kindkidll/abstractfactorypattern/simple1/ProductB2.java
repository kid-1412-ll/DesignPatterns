package com.kindkidll.abstractfactorypattern.simple1;

/**
 * @author leiliang
 * @description
 * @create 2022-11-27 9:39
 */
class ProductB2 implements AbstractProductB {

    @Override
    public void eat() {
        System.out.println(ProductB2.class.getName() + ".eat");
    }
}