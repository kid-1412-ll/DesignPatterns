package com.kindkidll.builderpattern.sample1;

/**
 * @author leiliang
 * @description 建造者2
 * @create 2022-10-12 11:40
 */
class ConcreteBuilder2 implements Builder {

    @Override
    public void buildPartA() {

    }

    @Override
    public void buildPartB() {

    }

    @Override
    public void buildPartC() {

    }

    @Override
    public Product getResult() {
        return new Product("ConcreteBuilder2 ==> Product(高配)");
    }
}
