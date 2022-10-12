package com.kindkidll.strategypattern.sample3;

/**
 * @author leiliang
 * @description
 * @create 2022-06-24 14:47
 */
class CashContext {

    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }

}
