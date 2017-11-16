package com.shellcore.android.factory.factories;

/**
 * Created by Shell on 15/11/2017.
 */

public abstract class Bread implements Ingredient {

    @Override
    public abstract String getName();

    @Override
    public abstract String getDescription();

    @Override
    public abstract int getCalories();

    @Override
    public abstract String getImage();

}
