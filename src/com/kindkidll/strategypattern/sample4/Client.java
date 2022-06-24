package com.kindkidll.strategypattern.sample4;


import java.util.Scanner;

/**
 * @author leiliang
 * @description 策略模式和简单工厂模式结合实现简单商场收银软件
 * @create 2022-06-24 14:45
 */
public class Client {

    private static final String[] DISCOUNT_TYPE = new String[]{"正常收费", "满300返100", "打八折"};

    /**
     * 和简单工厂模式相比，客户端只需要知道一个CashContext类
     */
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

                CashContext cashContext = new CashContext(DISCOUNT_TYPE[typeIndex]);
                System.out.println("总金额:" + cashContext.getResult(unitPrice * quantity));
            } catch (Exception e) {
                System.out.println("输入错误:" + e.getMessage());
            }
        }
    }

}
