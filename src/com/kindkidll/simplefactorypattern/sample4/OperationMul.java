package com.kindkidll.simplefactorypattern.sample4;

/**
 * @author leiliang
 * @description
 * @create 2022-06-15 16:18
 */
class OperationMul extends Operation {

    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }

}
