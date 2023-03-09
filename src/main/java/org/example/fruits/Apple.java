package org.example.fruits;

public class Apple extends Fruit{
    private static final int CALORIES = 100;
    private static final int PRICE = 10;

    @Override
    public int getCal() {
        return CALORIES;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }
}
