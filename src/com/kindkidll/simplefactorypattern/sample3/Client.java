package com.kindkidll.simplefactorypattern.sample3;

import java.util.Scanner;

/**
 * @author leiliang
 * @description 业务和界面解耦
 * @create 2022-06-15 16:04
 */
public class Client {

    /**
     * 1.业务逻辑与界面逻辑分离
     * 2.将运算操作封装
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

            strResult = String.valueOf(Operation.getResult(Double.parseDouble(strNumberA), Double.parseDouble(strNumberB), strOperate));

            System.out.println("结果是：" + strResult);
        } catch (Exception e) {
            System.out.println("您的输入有误：" + e.getMessage());
        }
    }

}
