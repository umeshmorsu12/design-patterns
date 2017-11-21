package com.morsu.designpatterns.creational.builder.mealmaker;

public class KidsMealBuilder  extends MealBuilder{

    @Override
    public void buildDrink() {
        // add drinks to the meal
    }

    @Override
    public void buildMainCourse() {
        // add main course to the meal
    }

    @Override
    public void buildDessert() {
        // add dessert to the meal
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}


