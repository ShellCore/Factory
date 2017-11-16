package com.shellcore.android.factory.factories;

/**
 * Created by Shell on 15/11/2017.
 */

public class Baguette implements Bread {

    @Override
    public String getName() {
        return "Baguette";
    }

    @Override
    public int getCalories() {
        return 3678;
    }
}
