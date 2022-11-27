package com.kindkidll.abstractfactorypattern.simple1;

/**
 * @author leiliang
 * @description
 * @create 2022-11-27 9:39
 */
class ProductA2 implements AbstractProductA {

    @Override
    public void use() {
        System.out.println(ProductA2.class.getName() + ".use");
    }
}