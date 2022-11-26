package com.kindkidll.singletonpattern.sample3;

/**
 * @author leiliang
 * @description 单例模式的懒汉式实现（双重校验）
 * @create 2022-11-26 15:14
 */
class Singleton {

    private volatile static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void singletonOperation() {
        System.out.println(Singleton.class.getName());
    }

}