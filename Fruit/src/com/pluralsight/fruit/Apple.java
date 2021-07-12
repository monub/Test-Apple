package com.pluralsight.fruit;


public class Apple implements IFruit {

    private static final String NAME = "Apple";


    public String getName() {
        return NAME;
    }


    public int getRollMultiplier() {
        return ROLL_MULTIPLIER;
    }

    private static final int ROLL_MULTIPLIER = 10;

}

