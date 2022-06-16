package com.kindkidll.simplefactorypattern.sample4;

/**
 * @author leiliang
 * @description
 * @create 2022-06-15 16:28
 */
public class OperationFactory {

    public static Operation createOperate(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
        }
        return operation;
    }

}
