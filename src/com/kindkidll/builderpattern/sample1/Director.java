package com.kindkidll.builderpattern.sample1;

/**
 * @author leiliang
 * @description 指挥者
 * @create 2022-10-12 11:25
 */
class Director {

    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
