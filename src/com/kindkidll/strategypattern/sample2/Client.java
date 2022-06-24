package com.kindkidll.strategypattern.sample2;

import java.util.Scanner;

/**
 * @author leiliang
 * @description 简单工厂模式实现简单商场收银软件
 * @create 2022-06-24 14:15
 */
public class Client {

    private static final String[] DISCOUNT_TYPE = new String[]{"正常收费", "满300返100", "打八折"};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("输入商品单价:");
                double unitPrice = Double.parseDouble(input.next());
                System.out.print("输入商品数量:");
                double quantity = Double.parseDouble(input.next());
                for (int i = 0; i < DISCOUNT_TYPE.length; i++) {
                    System.out.println(i + ":" + DISCOUNT_TYPE[i]);
                }
                System.out.print("选择折扣类型:");
                int typeIndex = Integer.parseInt(input.next());

                CashSuper cashSuper = CashFactory.createCashAccept(DISCOUNT_TYPE[typeIndex]);
                System.out.println("总金额:" + cashSuper.acceptCash(unitPrice * quantity));
            } catch (Exception e) {
                System.out.println("输入错误:" + e.getMessage());
            }
        }
    }

}
