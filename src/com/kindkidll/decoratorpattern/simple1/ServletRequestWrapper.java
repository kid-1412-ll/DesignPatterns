package com.kindkidll.decoratorpattern.simple1;

/**
 * @author leiliang
 * @description 抽象装饰类 Decorator
 * @create 2022-12-05 20:07
 */
class ServletRequestWrapper implements ServletRequest {

    private ServletRequest request;

    public ServletRequestWrapper(ServletRequest request) {
        this.request = request;
    }

    @Override
    public String getServerName() {
        return this.request.getServerName();
    }

    @Override
    public String getSession() {
        return this.request.getSession();
    }

    @Override
    public void show() {
        this.request.show();
    }
}
