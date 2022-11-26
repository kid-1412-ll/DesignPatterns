package com.kindkidll.factorymethodpattern.simple1;

/**
 * @author leiliang
 * @description
 * @create 2022-11-26 19:17
 */
class OperationFactoryMul extends OperationFactory {

    @Override
    public OperationMul createOperate() {
        return new OperationMul();
    }

}