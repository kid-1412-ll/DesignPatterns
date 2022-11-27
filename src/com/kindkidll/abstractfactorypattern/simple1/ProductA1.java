package com.kindkidll.abstractfactorypattern.simple1;

/**
 * @author leiliang
 * @description
 * @create 2022-11-27 9:39
 */
class ProductA1 implements AbstractProductA {

    @Override
    public void use() {
        System.out.println(ProductA1.class.getName() + ".use");
    }
}
