package com.kindkidll.strategypattern.sample2;

/**
 * @author leiliang
 * @description
 * @create 2022-06-24 14:32
 */
class CashFactory {

    private static final String[] DISCOUNT_TYPE = new String[]{"正常收费", "满300返100", "打八折"};

    public static CashSuper createCashAccept(String type) {
        CashSuper cashSuper = null;
        if (DISCOUNT_TYPE[0].equals(type)) {
            cashSuper = new CashNormal();
        } else if (DISCOUNT_TYPE[1].equals(type)) {
            cashSuper = new CashReturn(300, 100);
        } else if (DISCOUNT_TYPE[2].equals(type)) {
            cashSuper = new CashRebate(0.8);
        }
        return cashSuper;
    }

}
