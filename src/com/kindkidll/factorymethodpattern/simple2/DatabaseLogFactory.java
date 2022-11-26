package com.kindkidll.factorymethodpattern.simple2;

/**
 * @author leiliang
 * @description
 * @create 2022-11-26 19:36
 */
class DatabaseLogFactory extends LogFactory {

    @Override
    public DatabaseLog createLog() {
        return new DatabaseLog();
    }

}
