package com.shellcore.android.factory.factories;

/**
 * Created by Shell on 15/11/2017.
 */

class DrinkFactory implements AbstractFactory {
    @Override
    public Bread getBread(String breadType) {
        return null;
    }

    @Override
    public Filling getFilling(String fillingType) {
        return null;
    }

    @Override
    public Drink getDrink(String drinkType) {
        if (drinkType == null) {
            return null;
        }
        switch (drinkType) {
            case "BEE":
                return new Beer();
            case "COK":
                return new Coke();
            default:
                return null;
        }
    }
}
