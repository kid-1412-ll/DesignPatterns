package com.kindkidll.builderpattern.sample2;

/**
 * @author leiliang
 * @description KFC套餐案例
 * @create 2022-10-12 11:07
 */
public class Sample2 {

    public static void main(String[] args) {
        KFCWatier watier = new KFCWatier();

        watier.setBuilder(new SubMealBuilderA());
        System.out.println(watier.construct());

        watier.setBuilder(new SubMealBuilderB());
        System.out.println(watier.construct());
    }
}
