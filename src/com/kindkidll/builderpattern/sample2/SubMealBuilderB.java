package com.kindkidll.builderpattern.sample2;

/**
 * @author leiliang
 * @description 创建 B 套餐
 * @create 2022-10-12 19:12
 */
class SubMealBuilderB implements MealBuilder {

    @Override
    public void buildDrink() {
        meal.setDrink("奶昔");
    }

    @Override
    public void buildFood() {
        meal.setFood("饭");
    }
}
