package com.kindkidll.simplefactorypattern.sample1;

import java.util.Scanner;

/**
 * @author leiliang
 * @description 简单工厂模式的引入案例，编写一个简单计算器
 * @create 2022-06-15 15:07
 */
class Sample1 {

    /**
     *  需要改进的地方
     *  1.不规范的变量名A、B、C、D
     *  2.多次无用的if分支判断
     *  3.未对输入做校验
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入数字A：");
        String A = input.next();
        System.out.println("请选择运算符号(+、-、*、/)：");
        String B = input.next();
        System.out.println("请输入数字B：");
        String C = input.next();
        String D = "";

        if ("+".equals(B)) {
            D = String.valueOf(Double.parseDouble(A) + Double.parseDouble(C));
        }
        if ("-".equals(B)) {
            D = String.valueOf(Double.parseDouble(A) - Double.parseDouble(C));
        }
        if ("*".equals(B)) {
            D = String.valueOf(Double.parseDouble(A) * Double.parseDouble(C));
        }
        if ("/".equals(B)) {
            D = String.valueOf(Double.parseDouble(A) / Double.parseDouble(C));
        }

        System.out.println("结果是：" + D);
    }

}
