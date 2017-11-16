package com.shellcore.android.factory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.shellcore.android.factory.factories.AbstractFactory;
import com.shellcore.android.factory.factories.Baguette;
import com.shellcore.android.factory.factories.Bread;
import com.shellcore.android.factory.factories.Chesse;
import com.shellcore.android.factory.factories.Drink;
import com.shellcore.android.factory.factories.FactoryGenerator;
import com.shellcore.android.factory.factories.Filling;
import com.shellcore.android.factory.factories.Tomato;
import com.shellcore.android.factory.products.Sandwich;
import com.shellcore.android.factory.products.SandwichBuilder;

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

        SandwichBuilder builder = new SandwichBuilder();

        Sandwich s1 = builder.cheeseAndHam();

        Log.d(TAG, "Primer sandwich");
        s1.getIngredients();
        s1.getCalories();

        Sandwich s2 = builder.cheeseAndHam();
        s2 = builder.build(s2, new Tomato());

        Log.d(TAG, "Segundo sandwich");
        s2.getIngredients();
        s2.getCalories();

        Sandwich s3 = new Sandwich();
        s3 = builder.build(s3, new Baguette());
        s3 = builder.build(s3, new Chesse());
        s3 = builder.build(s3, new Chesse());
        s3 = builder.build(s3, new Tomato());

        Log.d(TAG, "Tercer sandwich");
        s3.getIngredients();
        s3.getCalories();
    }
}
