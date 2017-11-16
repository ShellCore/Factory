package com.shellcore.android.factory.factories;

import com.shellcore.android.factory.R;

/**
 * Created by Shell on 15/11/2017.
 */

public class Beer implements Drink {

    @Override
    public String getName() {
        return "Beer";
    }

    @Override
    public String getDescription() {
        return "Una fría y refrescante cerveza de malta";
    }

    @Override
    public int getCalories() {
        return 350;
    }

    @Override
    public String getImage() {
        return "R.drawable.beer";
    }
}
