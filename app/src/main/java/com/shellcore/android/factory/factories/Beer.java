package com.shellcore.android.factory.factories;

/**
 * Created by Shell on 15/11/2017.
 */

public class Beer implements Drink {

    @Override
    public String getName() {
        return "Beer";
    }

    @Override
    public int getCalories() {
        return 350;
    }
}
