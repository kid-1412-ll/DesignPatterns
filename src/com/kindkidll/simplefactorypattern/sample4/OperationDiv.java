package com.kindkidll.simplefactorypattern.sample4;

/**
 * @author leiliang
 * @description
 * @create 2022-06-15 16:24
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        if (Double.compare(getNumberB(), 0) == 0) {
            throw new IllegalArgumentException("除数不能为0。");
        }
        return getNumberA() / getNumberB();
    }

}
