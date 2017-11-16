package com.shellcore.android.factory.factories;

/**
 * Created by Shell on 15/11/2017.
 */

public class Tomato implements Filling {
    @Override
    public String getName() {
        return "Tomato";
    }

    @Override
    public int getCalories() {
        return 75;
    }
}
