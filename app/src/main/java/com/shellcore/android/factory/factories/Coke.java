package com.shellcore.android.factory.factories;

/**
 * Created by Shell on 15/11/2017.
 */

public class Coke implements Drink {
    @Override
    public String getName() {
        return "Coke";
    }

    @Override
    public int getCalories() {
        return 163;
    }
}
