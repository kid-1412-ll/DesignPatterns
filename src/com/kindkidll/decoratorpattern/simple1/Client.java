package com.kindkidll.decoratorpattern.simple1;

/**
 * @author leiliang
 * @description 装饰模式简单实现
 * @create 2022-12-05 20:14
 */
class Client {

    public static void main(String[] args) {
        ServletRequest request = new HttpServletRequest("1号请求", "123456");
        request = new MysqlServletRequestWrapper(request);
        request.show();


        ServletRequest servletRequest = new HttpServletRequest("2号请求", "987654");
        servletRequest = new RedisServletRequestWrapper(servletRequest);
        servletRequest.show();
    }
}
