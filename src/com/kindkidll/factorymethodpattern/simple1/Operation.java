package com.kindkidll.factorymethodpattern.simple1;

/**
 * @author leiliang
 * @description
 * @create 2022-06-15 16:11
 */
abstract class Operation {

    private double numberA = 0;
    private double numberB = 0;

    /**
     * 获取运算结果
     *
     * @return 结果
     */
    public abstract double getResult();

    public Operation() {
    }

    public Operation(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

}
