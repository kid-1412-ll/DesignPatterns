package com.kindkidll.simplefactorypattern.sample2;

import java.util.Scanner;

/**
 * @author leiliang
 * @description 修复了样例1中的问题
 * @create 2022-06-15 15:22
 */
class Sample2 {

    /**
     * 需要改进的地方
     * 1.不易维护、不易扩展、不易复用
     * 2.业务逻辑与界面逻辑耦合
     */
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            System.out.println("请输入数字A：");
            String strNumberA = input.next();
            System.out.println("请选择运算符号(+、-、*、/)：");
            String strOperate = input.next();
            System.out.println("请输入数字B：");
            String strNumberB = input.next();
            String strResult = "";

            switch (strOperate) {
                case "+":
                    strResult = String.valueOf(Double.parseDouble(strNumberA) + Double.parseDouble(strNumberB));
                    break;
                case "-":
                    strResult = String.valueOf(Double.parseDouble(strNumberA) - Double.parseDouble(strNumberB));
                    break;
                case "*":
                    strResult = String.valueOf(Double.parseDouble(strNumberA) * Double.parseDouble(strNumberB));
                    break;
                case "/":
                    if (!"0".equals(strNumberB)) {
                        strResult = String.valueOf(Double.parseDouble(strNumberA) / Double.parseDouble(strNumberB));
                    } else {
                        strResult = "除数不能为0";
                    }
                    break;
                default:
            }

            System.out.println("结果是：" + strResult);
        } catch (Exception e) {
            System.out.println("您的输入有误：" + e.getMessage());
        }
    }

}
