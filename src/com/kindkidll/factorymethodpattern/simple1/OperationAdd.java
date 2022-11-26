package com.kindkidll.factorymethodpattern.simple1;

/**
 * @author leiliang
 * @description 加法类
 * @create 2022-06-15 16:15
 */
class OperationAdd extends Operation {

    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }

}
