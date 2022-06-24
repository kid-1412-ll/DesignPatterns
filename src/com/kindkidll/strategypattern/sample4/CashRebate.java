package com.kindkidll.strategypattern.sample4;

/**
 * @author leiliang
 * @description
 * @create 2022-06-24 14:20
 */
public class CashRebate extends CashSuper {

    private double moneyRebate = 1;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
