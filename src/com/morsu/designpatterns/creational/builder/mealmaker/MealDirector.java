package com.morsu.designpatterns.creational.builder.mealmaker;

public class MealDirector {
    public Meal createMeal(MealBuilder builder){
        builder.buildDrink();
        builder.buildMainCourse();
        builder.buildDessert();
        return builder.getMeal();
    }
}
