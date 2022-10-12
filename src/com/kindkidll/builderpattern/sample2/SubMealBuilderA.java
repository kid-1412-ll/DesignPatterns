package com.kindkidll.builderpattern.sample2;

/**
 * @author leiliang
 * @description 创建 A 套餐
 * @create 2022-10-12 19:10
 */
class SubMealBuilderA implements MealBuilder {

    @Override
    public void buildDrink() {
        meal.setDrink("大杯冰可乐");
    }

    @Override
    public void buildFood() {
        meal.setFood("十翅一桶");
    }

}
