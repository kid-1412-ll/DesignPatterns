package com.kindkidll.builderpattern.sample1;

/**
 * @author leiliang
 * @description 具体的产品
 * @create 2022-10-12 11:28
 */
class Product {

    private String msg;

    public Product(String msg) {
        this.msg = msg;
    }

    public void show() {
        System.out.println(msg);
    }
}
