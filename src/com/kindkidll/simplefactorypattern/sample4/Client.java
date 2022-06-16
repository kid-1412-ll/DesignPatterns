package com.kindkidll.simplefactorypattern.sample4;

import java.util.Scanner;

/**
 * @author leiliang
 * @description 简单工厂模式实现简单计算器
 * @create 2022-06-15 16:32
 */
public class Client {

    /**
     * 当需要新增运算操作时，需要执行以下操作
     * 1.新增运算的具体实现类
     * 2.更新工厂以生产新的操作类
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

            Operation operation = OperationFactory.createOperate(strOperate);
            operation.setNumberA(Double.parseDouble(strNumberA));
            operation.setNumberB(Double.parseDouble(strNumberB));
            double result = operation.getResult();

            System.out.println("结果是：" + result);
        } catch (Exception e) {
            System.out.println("您的输入有误：" + e.getMessage());
        }
    }

}
