package com.kindkidll.builderpattern.sample1;

/**
 * @author leiliang
 * @description 建造者抽象类
 * @create 2022-10-12 11:09
 */
interface Builder {

    /**
     * 建造A部分
     */
    void buildPartA();

    /**
     * 建造B部分
     */
    void buildPartB();

    /**
     * 建造C部分
     */
    void buildPartC();

    /**
     * 得到结果
     */
    Product getResult();
}
