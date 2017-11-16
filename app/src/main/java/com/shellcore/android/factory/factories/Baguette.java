package com.shellcore.android.factory.factories;

import com.shellcore.android.factory.R;

/**
 * Created by Shell on 15/11/2017.
 */

public class Baguette extends Bread {

    @Override
    public String getName() {
        return "Baguette";
    }

    @Override
    public String getDescription() {
        return "Una bagette recién hecha y muy crujiente";
    }

    @Override
    public int getCalories() {
        return 3678;
    }

    @Override
    public String getImage() {
        return "R.drawable.baguette";
    }
}
