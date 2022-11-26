package com.kindkidll.factorymethodpattern.simple2;

/**
 * @author leiliang
 * @description
 * @create 2022-11-26 19:36
 */
class FileLogFactory extends LogFactory {

    @Override
    public FileLog createLog() {
        return new FileLog();
    }

}
