package com.morsu.designpatterns.creational.builder.mealmaker;

public class AdultMealBuilder extends MealBuilder {
    public void buildDrink(){
        // add drinks to the meal
    }

    @Override
    public void buildMainCourse() {

    }

    public void buildDessert(){
        // add dessert part to the meal
    }
    public Meal getMeal(){return meal;}
}
