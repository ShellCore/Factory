package com.shellcore.android.factory.factories;

/**
 * Created by Shell on 15/11/2017.
 */

public class FactoryGenerator {

    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType == null) {
            return null;
        }

        switch (factoryType) {
            case "BRE":
                return new BreadFactory();
            case "FIL":
                return new FillingFactory();
            case "DRI":
                return new DrinkFactory();
            default:
                return null;
        }
    }
}
