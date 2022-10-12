package com.kindkidll.builderpattern.sample2;

/**
 * @author leiliang
 * @description 建造者接口
 * @create 2022-10-12 19:00
 */
interface MealBuilder {

    Meal meal = new Meal();

    /**
     * 创建饮料
     */
    void buildDrink();

    /**
     * 创建主食
     */
    void buildFood();

    /**
     * 返回生成的菜单
     */
    default Meal getMeal() {
        return meal;
    }
}
