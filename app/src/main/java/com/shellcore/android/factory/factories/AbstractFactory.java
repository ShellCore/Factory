package com.shellcore.android.factory.factories;

/**
 * Created by Shell on 15/11/2017.
 */

public interface AbstractFactory {

    Bread getBread(String breadType);
    Filling getFilling(String fillingType);
    Drink getDrink(String drinkType);
}
