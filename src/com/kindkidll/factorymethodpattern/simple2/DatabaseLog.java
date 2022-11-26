package com.kindkidll.factorymethodpattern.simple2;

/**
 * @author leiliang
 * @description
 * @create 2022-11-26 19:35
 */
class DatabaseLog extends Log {

    @Override
    public void writeLog(String log) {
        System.out.println("正在写入数据库。。。" + log);
    }

}
