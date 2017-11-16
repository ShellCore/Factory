package com.shellcore.android.factory.factories;

/**
 * Created by Shell on 15/11/2017.
 */

public class Chesse extends Filling {
    @Override
    public String getName() {
        return "Cheese";
    }

    @Override
    public String getDescription() {
        return "Una suave y delicada rebanada de queso";
    }

    @Override
    public int getCalories() {
        return 833;
    }

    @Override
    public String getImage() {
        return "R.drawable.cheese";
    }
}
