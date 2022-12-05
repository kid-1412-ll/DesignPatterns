package com.kindkidll.decoratorpattern.simple1;

/**
 * @author leiliang
 * @description 具体装饰类 ConcreteDecorator
 * @create 2022-12-05 20:11
 */
class RedisServletRequestWrapper extends ServletRequestWrapper implements ServletRequest {

    public RedisServletRequestWrapper(ServletRequest request) {
        super(request);
    }

    @Override
    public void show() {
        super.show();
        addBehavior();
    }

    public void addBehavior() {
        System.out.println("session save to Redis!");
    }
}
