package com.kindkidll.builderpattern.sample1;

/**
 * @author leiliang
 * @description 简单的建造者模式样例
 * @create 2022-10-12 11:07
 */
public class Sample1 {

    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new ConcreteBuilder1());
        director.construct().show();

        director.setBuilder(new ConcreteBuilder2());
        director.construct().show();
    }
}
