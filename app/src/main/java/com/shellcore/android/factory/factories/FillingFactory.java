package com.shellcore.android.factory.factories;

/**
 * Created by Shell on 15/11/2017.
 */

public class FillingFactory implements AbstractFactory {

    @Override
    public Bread getBread(String breadType) {
        return null;
    }

    @Override
    public Filling getFilling(String fillingType) {
        if (fillingType == null) {
            return null;
        }
        switch (fillingType) {
            case "CHE":
                return new Chesse();
            case "HAM":
                return new Ham();
            case "TOM":
                return new Tomato();
            default:
                return null;
        }
    }

    @Override
    public Drink getDrink(String drinkType) {
        return null;
    }
}
