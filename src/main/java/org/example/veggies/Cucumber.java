package org.example.veggies;

public class Cucumber extends Vegetable {
    private static final int CALORIES = 10;
    private static final int PRICE = 25;
    @Override
    public int getCal() {
        return CALORIES;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }
}
