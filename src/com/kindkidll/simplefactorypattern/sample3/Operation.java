package com.kindkidll.simplefactorypattern.sample3;

/**
 * @author leiliang
 * @description
 * @create 2022-06-15 15:59
 */
class Operation {

    public static double getResult(double numberA, double numberB, String operate) {
        double result = 0d;
        switch (operate) {
            case "+":
                result = numberA + numberB;
                break;
            case "-":
                result = numberA - numberB;
                break;
            case "*":
                result = numberA * numberB;
                break;
            case "/":
                result = numberA / numberB;
                break;
            default:
        }
        return result;
    }

}
