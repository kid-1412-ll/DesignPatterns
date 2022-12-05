package com.kindkidll.decoratorpattern.simple1;

/**
 * @author leiliang
 * @description 具体构件 ConcreteComponent
 * @create 2022-12-05 20:05
 */
class HttpServletRequest implements ServletRequest {

    private String name;
    private String session;

    public HttpServletRequest(String name, String session) {
        this.name = name;
        this.session = session;
    }

    @Override
    public String getServerName() {
        return this.name;
    }

    @Override
    public String getSession() {
        return this.session;
    }

    @Override
    public void show() {
        System.out.println(getServerName() + "/" + getSession());
    }
}
