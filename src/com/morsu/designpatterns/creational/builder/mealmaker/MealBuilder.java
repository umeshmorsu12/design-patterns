package com.morsu.designpatterns.creational.builder.mealmaker;

public abstract class MealBuilder {
    protected Meal meal = new Meal();
    public abstract void buildDrink();
    public abstract void buildMainCourse();
    public abstract void buildDessert();
    public abstract Meal getMeal();
}
