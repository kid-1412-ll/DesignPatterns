package com.kindkidll.decoratorpattern.simple1;

/**
 * @author leiliang
 * @description 抽象构件 Component
 * @create 2022-12-05 19:59
 */
interface ServletRequest {

    String getServerName();

    String getSession();

    void show();
}
