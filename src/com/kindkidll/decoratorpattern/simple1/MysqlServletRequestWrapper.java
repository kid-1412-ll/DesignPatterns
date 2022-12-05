package com.kindkidll.decoratorpattern.simple1;

/**
 * @author leiliang
 * @description 具体装饰类 ConcreteDecorator
 * @create 2022-12-05 20:32
 */
class MysqlServletRequestWrapper extends ServletRequestWrapper implements ServletRequest {

    public MysqlServletRequestWrapper(ServletRequest request) {
        super(request);
    }

    @Override
    public void show() {
        super.show();
        addBehavior();
    }

    public void addBehavior() {
        System.out.println("session save to MySQL!");
    }
}
