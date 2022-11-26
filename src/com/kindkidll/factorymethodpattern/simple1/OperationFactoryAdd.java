package com.kindkidll.factorymethodpattern.simple1;

/**
 * @author leiliang
 * @description
 * @create 2022-11-26 19:15
 */
class OperationFactoryAdd extends OperationFactory {

    @Override
    public OperationAdd createOperate() {
        return new OperationAdd();
    }

}
