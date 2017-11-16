package com.shellcore.android.factory.factories;

/**
 * Created by Shell on 15/11/2017.
 */

public class Roll implements Bread {
    @Override
    public String getName() {
        return "Roll";
    }

    @Override
    public int getCalories() {
        return 425;
    }
}
