package com.kindkidll.flyweightpattern.simple1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leiliang
 * @description 享元工厂类
 * @create 2022-12-07 19:52
 */
class FlyweightFactory {

    private static final Map<String, Flyweight> FLYWEIGHT_MAP = new HashMap<>();

    public static Flyweight getFlyweight(String key) {
        if (!FLYWEIGHT_MAP.containsKey(key)) {
            FLYWEIGHT_MAP.put(key, new ConcreteFlyweight(key));
        }
        return FLYWEIGHT_MAP.get(key);
    }

    public static int getCount() {
        return FLYWEIGHT_MAP.size();
    }
}
