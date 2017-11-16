package com.shellcore.android.factory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.shellcore.android.factory.factories.AbstractFactory;
import com.shellcore.android.factory.factories.Bread;
import com.shellcore.android.factory.factories.Drink;
import com.shellcore.android.factory.factories.FactoryGenerator;
import com.shellcore.android.factory.factories.Filling;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AbstractFactory breadFactory = FactoryGenerator.getFactory("BRE");
        Bread baguette = breadFactory.getBread("BAG");

        AbstractFactory fillingFactory = FactoryGenerator.getFactory("FIL");
        Filling tomato = fillingFactory.getFilling("TOM");

        Log.d(TAG, baguette.getName() + " : " + baguette.getCalories());
        Log.d(TAG, tomato.getName() + " : " + tomato.getCalories());
    }
}
