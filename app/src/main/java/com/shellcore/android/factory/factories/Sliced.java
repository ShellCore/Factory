package com.shellcore.android.factory.factories;

import com.shellcore.android.factory.R;

/**
 * Created by Shell on 15/11/2017.
 */

public class Sliced extends Bread {
    @Override
    public String getName() {
        return "Sliced";
    }

    @Override
    public String getDescription() {
        return "Unas suaves rebanadas de pan de caja";
    }

    @Override
    public int getCalories() {
        return 6560;
    }

    @Override
    public String getImage() {
        return "R.drawable.sliced";
    }
}
