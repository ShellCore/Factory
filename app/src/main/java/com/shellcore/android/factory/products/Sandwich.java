package com.shellcore.android.factory.products;

import android.util.Log;

import com.shellcore.android.factory.factories.Ingredient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shell on 15/11/2017.
 */

public class Sandwich {

    private static final String TAG = "Sandwich";

    private List<Ingredient> ingredients = new ArrayList<>();

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void getCalories() {
        int totalCalories = 0;

        for (Ingredient ingredient : ingredients) {
            totalCalories += ingredient.getCalories();
        }

        Log.d(TAG, "Total de calorías: " + totalCalories);
    }

    public void getIngredients() {
        for (Ingredient ingredient : ingredients) {
            Log.d(TAG, ingredient.getName() + ": " + ingredient.getCalories() + " calorias");
        }
    }
}
