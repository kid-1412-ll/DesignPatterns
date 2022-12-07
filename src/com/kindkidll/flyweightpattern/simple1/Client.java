package com.kindkidll.flyweightpattern.simple1;

/**
 * @author leiliang
 * @description 享元模式简单实现
 * @create 2022-12-07 19:51
 */
class Client {

    public static void main(String[] args) {
        Flyweight flyweight = FlyweightFactory.getFlyweight("Game");
        flyweight.use("lol");
        flyweight.use("satellite");

        flyweight = FlyweightFactory.getFlyweight("Acm");
        flyweight.use("wa");
        flyweight.use("tle");

        System.out.println(FlyweightFactory.getCount());
    }
}
