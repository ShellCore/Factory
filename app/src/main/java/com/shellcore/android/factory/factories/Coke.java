package com.shellcore.android.factory.factories;

import com.shellcore.android.factory.R;

/**
 * Created by Shell on 15/11/2017.
 */

public class Coke implements Drink {
    @Override
    public String getName() {
        return "Coke";
    }

    @Override
    public String getDescription() {
        return "Una fría y refrescante lata de Coca-Cola";
    }

    @Override
    public int getCalories() {
        return 163;
    }

    @Override
    public String getImage() {
        return "R.drawable.roll";
    }
}
