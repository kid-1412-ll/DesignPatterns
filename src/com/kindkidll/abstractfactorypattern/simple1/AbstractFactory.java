package com.kindkidll.abstractfactorypattern.simple1;

/**
 * @author leiliang
 * @description
 * @create 2022-11-27 9:38
 */
interface AbstractFactory {

    AbstractProductA createProductA();

    AbstractProductB createProductB();
}
