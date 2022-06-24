package com.kindkidll.strategypattern.sample1;

import java.util.Scanner;

/**
 * @author leiliang
 * @description 策略模式的引入案例，编写一个简单商场收银软件
 * @create 2022-06-24 9:43
 */
public class Sample1 {

    private static final String[] DISCOUNT_TYPE = new String[]{"正常收费", "打八折", "打七折", "打六折"};

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
                int type = Integer.parseInt(input.next());

                double totalPrice = unitPrice * quantity;
                switch (type) {
                    case 0:
                        break;
                    case 1:
                        totalPrice *= 0.8;
                        break;
                    case 2:
                        totalPrice *= 0.7;
                        break;
                    case 3:
                        totalPrice *= 0.6;
                        break;
                    default:
                        throw new IllegalArgumentException("折扣类型不存在");
                }
                System.out.println("总金额:" + totalPrice);
            } catch (Exception e) {
                System.out.println("输入错误:" + e.getMessage());
            }
        }
    }

}
