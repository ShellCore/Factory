package com.shellcore.android.factory.factories;

/**
 * Created by Shell on 15/11/2017.
 */

class Ham implements Filling {
    @Override
    public String getName() {
        return "Ham";
    }

    @Override
    public int getCalories() {
        return 700;
    }
}
