package com.morsu.designpatterns.creational.builder.mealmaker;

public class MealBuilderClient {

    public static void main(String args[]){
        boolean isKid = false;
        MealDirector director = new MealDirector();
        MealBuilder builder = null;

        if (isKid) {
            builder = new KidsMealBuilder();
        } else
            builder = new AdultMealBuilder();

        Meal meal = director.createMeal(builder);
    }
}
