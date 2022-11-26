package com.kindkidll.strategypattern.sample3;


import java.util.Scanner;

/**
 * @author leiliang
 * @description 策略模式实现简单商场收银软件
 * @create 2022-06-24 14:45
 */
class Client {

    private static final String[] DISCOUNT_TYPE = new String[]{"正常收费", "满300返100", "打八折"};

    /**
     * 缺点：在客户端判断使用哪一个算法
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
                int type = Integer.parseInt(input.next());

                CashContext cashContext;
                switch (type) {
                    case 0:
                        cashContext = new CashContext(new CashNormal());
                        break;
                    case 1:
                        cashContext = new CashContext(new CashReturn(300, 100));
                        break;
                    case 2:
                        cashContext = new CashContext(new CashRebate(0.8));
                        break;
                    default:
                        throw new IllegalArgumentException("折扣类型不存在");
                }
                System.out.println("总金额:" + cashContext.getResult(unitPrice * quantity));
            } catch (Exception e) {
                System.out.println("输入错误:" + e.getMessage());
            }
        }
    }

}
