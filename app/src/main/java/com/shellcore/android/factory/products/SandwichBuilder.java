package com.shellcore.android.factory.products;

import com.shellcore.android.factory.factories.Chesse;
import com.shellcore.android.factory.factories.Ham;
import com.shellcore.android.factory.factories.Ingredient;
import com.shellcore.android.factory.factories.Sliced;

/**
 * Created by Shell on 15/11/2017.
 */

public class SandwichBuilder {

    public static Sandwich cheeseAndHam() {
        Sandwich sandwich = new Sandwich();

        sandwich.addIngredient(new Sliced());
        sandwich.addIngredient(new Ham());
        sandwich.addIngredient(new Chesse());

        return sandwich;
    }

    public static Sandwich build(Sandwich s, Ingredient i) {
        s.addIngredient(i);
        return s;
    }
}
