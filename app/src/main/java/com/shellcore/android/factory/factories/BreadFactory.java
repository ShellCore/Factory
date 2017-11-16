package com.shellcore.android.factory.factories;

/**
 * Created by Shell on 15/11/2017.
 */

public class BreadFactory implements AbstractFactory {

    @Override
    public Bread getBread(String breadType) {
        if (breadType == null) {
            return null;
        }

        switch (breadType) {
            case "BAG":
                return new Baguette();
            case "ROLL":
                return new Roll();
            case "SLI":
                return new Sliced();
            default:
                return null;
        }
    }

    @Override
    public Filling getFilling(String fillingType) {
        return null;
    }

    @Override
    public Drink getDrink(String drinkType) {
        return null;
    }
}
