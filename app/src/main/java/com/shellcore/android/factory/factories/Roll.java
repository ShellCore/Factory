package com.shellcore.android.factory.factories;

import com.shellcore.android.factory.R;

/**
 * Created by Shell on 15/11/2017.
 */

public class Roll extends Bread {
    @Override
    public String getName() {
        return "Roll";
    }

    @Override
    public String getDescription() {
        return "Un crujiente pan de pita";
    }

    @Override
    public int getCalories() {
        return 425;
    }

    @Override
    public String getImage() {
        return "R.drawable.roll";
    }
}
