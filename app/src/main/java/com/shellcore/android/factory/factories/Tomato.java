package com.shellcore.android.factory.factories;

/**
 * Created by Shell on 15/11/2017.
 */

public class Tomato extends Filling {
    @Override
    public String getName() {
        return "Tomato";
    }

    @Override
    public String getDescription() {
        return "Un fresco y saludable tomate";
    }

    @Override
    public int getCalories() {
        return 75;
    }

    @Override
    public String getImage() {
        return "R.drawable.tomato";
    }
}
