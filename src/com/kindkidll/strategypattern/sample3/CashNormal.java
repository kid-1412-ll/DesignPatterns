package com.kindkidll.strategypattern.sample3;

/**
 * @author leiliang
 * @description
 * @create 2022-06-24 14:18
 */
class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }

}
