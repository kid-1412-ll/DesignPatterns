package com.kindkidll.singletonpattern.sample1;

/**
 * @author leiliang
 * @description 单例模式的懒汉式实现（非线程安全）
 * @create 2022-11-26 15:14
 */
class Singleton {

    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void singletonOperation() {
        System.out.println(Singleton.class.getName());
    }

}