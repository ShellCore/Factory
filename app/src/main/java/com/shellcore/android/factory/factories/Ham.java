package com.shellcore.android.factory.factories;

/**
 * Created by Shell on 15/11/2017.
 */

public class Ham extends Filling {
    @Override
    public String getName() {
        return "Ham";
    }

    @Override
    public String getDescription() {
        return "Una fresca y carnosa rebanada de jamón";
    }

    @Override
    public int getCalories() {
        return 700;
    }

    @Override
    public String getImage() {
        return "R.drawable.ham";
    }
}
