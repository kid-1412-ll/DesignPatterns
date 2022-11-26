package com.kindkidll.singletonpattern.sample2;

/**
 * @author leiliang
 * @description 单例模式的饿汉式实现
 * @create 2022-11-26 15:14
 */
class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void singletonOperation() {
        System.out.println(Singleton.class.getName());
    }

}