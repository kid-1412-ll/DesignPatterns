package com.kindkidll.builderpattern.sample2;

/**
 * @author leiliang
 * @description 菜单
 * @create 2022-10-12 19:02
 */
class Meal {

    private String food;

    private String drink;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "food='" + food + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}
