package com.kindkidll.simplefactorypattern.sample4;

/**
 * @author leiliang
 * @description
 * @create 2022-06-15 16:17
 */
class OperationSub extends Operation {

    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }

}
