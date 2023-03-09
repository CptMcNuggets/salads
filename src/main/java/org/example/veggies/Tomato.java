package org.example.veggies;

public class Tomato extends Veggie{
    private static final int CALORIES = 50;
    private static final int PRICE = 30;
    @Override
    public int getCal() {
        return CALORIES;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }
}
