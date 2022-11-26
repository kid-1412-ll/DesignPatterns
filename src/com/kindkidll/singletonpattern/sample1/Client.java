package com.kindkidll.singletonpattern.sample1;

/**
 * @author leiliang
 * @description
 * @create 2022-11-26 15:23
 */
class Client {

    public static void main(String[] args) {
        Singleton.getInstance().singletonOperation();
    }

}
