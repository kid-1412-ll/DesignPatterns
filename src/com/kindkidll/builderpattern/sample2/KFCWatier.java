package com.kindkidll.builderpattern.sample2;

/**
 * @author leiliang
 * @description KFC 服务员
 * @create 2022-10-12 18:59
 */
class KFCWatier {

    private MealBuilder builder;

    public void setBuilder(MealBuilder builder) {
        this.builder = builder;
    }

    public Meal construct() {
        builder.buildDrink();
        builder.buildFood();
        return builder.getMeal();
    }
}
