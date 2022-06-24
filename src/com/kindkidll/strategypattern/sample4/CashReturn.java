package com.kindkidll.strategypattern.sample4;

/**
 * @author leiliang
 * @description
 * @create 2022-06-24 14:21
 */
public class CashReturn extends CashSuper {

    private double moneyCondition = 0.0;
    private double moneyReturn = 0.0;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        if (Double.compare(money, moneyCondition) >= 0) {
            money -= moneyReturn;
        }
        return money;
    }
}
