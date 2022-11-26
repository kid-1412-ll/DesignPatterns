package com.kindkidll.factorymethodpattern.simple1;

import java.util.Scanner;

/**
 * @author leiliang
 * @description 工厂方法模式实现简单计算器
 * @create 2022-11-26 19:11
 */
class Client {

    /**
     * 当需要新增运算操作时，需要执行以下操作
     * 1.新增运算的具体实现类
     * 2.新增生产具体实现类的具体工厂
     * 3.修改生产具体工厂的判断逻辑
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

            OperationFactory operationFactory;
            switch (strOperate) {
                case "+":
                    operationFactory = new OperationFactoryAdd();
                    break;
                case "-":
                    operationFactory = new OperationFactorySub();
                    break;
                case "*":
                    operationFactory = new OperationFactoryMul();
                    break;
                case "/":
                    operationFactory = new OperationFactoryDiv();
                    break;
                default:
                    throw new IllegalArgumentException(strOperate);
            }

            Operation operation = operationFactory.createOperate();
            operation.setNumberA(Double.parseDouble(strNumberA));
            operation.setNumberB(Double.parseDouble(strNumberB));
            double result = operation.getResult();

            System.out.println("结果是：" + result);
        } catch (Exception e) {
            System.out.println("您的输入有误：" + e.getMessage());
        }
    }

}
