package com.kindkidll.proxypattern.simple1;

/**
 * @author leiliang
 * @description 真实主题角色
 * @create 2022-12-10 14:08
 */
class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println(RealSubject.class.getName() + ".request()");
    }
}
