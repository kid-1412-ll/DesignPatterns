package com.kindkidll.builderpattern.sample1;

/**
 * @author leiliang
 * @description 建造者1
 * @create 2022-10-12 11:11
 */
class ConcreteBuilder1 implements Builder {

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
        return new Product("ConcreteBuilder1 ==> Product(标配)");
    }
}
