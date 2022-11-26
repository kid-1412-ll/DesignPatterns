package com.kindkidll.factorymethodpattern.simple1;

/**
 * @author leiliang
 * @description
 * @create 2022-11-26 19:17
 */
class OperationFactoryDiv extends OperationFactory {

    @Override
    public OperationDiv createOperate() {
        return new OperationDiv();
    }

}
