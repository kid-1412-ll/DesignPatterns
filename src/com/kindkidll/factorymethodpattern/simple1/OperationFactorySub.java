package com.kindkidll.factorymethodpattern.simple1;

/**
 * @author leiliang
 * @description
 * @create 2022-11-26 19:18
 */
class OperationFactorySub extends OperationFactory {

    @Override
    public OperationSub createOperate() {
        return new OperationSub();
    }

}
