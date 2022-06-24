package com.kindkidll.strategypattern.sample4;

/**
 * @author leiliang
 * @description
 * @create 2022-06-24 14:47
 */
public class CashContext {

    private static final String[] DISCOUNT_TYPE = new String[]{"正常收费", "满300返100", "打八折"};

    private CashSuper cashSuper;

    public CashContext(String type) {
        if (DISCOUNT_TYPE[0].equals(type)) {
            this.cashSuper = new CashNormal();
        } else if (DISCOUNT_TYPE[1].equals(type)) {
            this.cashSuper = new CashReturn(300, 100);
        } else if (DISCOUNT_TYPE[2].equals(type)) {
            this.cashSuper = new CashRebate(0.8);
        }
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }

}
