package com.kindkidll.proxypattern.simple1;

/**
 * @author leiliang
 * @description 代理主题角色
 * @create 2022-12-10 14:04
 */
class Proxy implements Subject {

    @Override
    public void request() {
        preRequest();
        new RealSubject().request();
        afterRequest();
    }

    private void preRequest() {
        System.out.println(Proxy.class.getName() + ".preRequest()");
    }

    private void afterRequest() {
        System.out.println(Proxy.class.getName() + ".afterRequest()");
    }
}
