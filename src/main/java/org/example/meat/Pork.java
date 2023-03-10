package org.example.meat;

public class Pork extends Meat{
    private static final int CALORIES = 200;
    private static final int PRICE = 100;
    @Override
    public int getCal() {
        return CALORIES;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }
}
