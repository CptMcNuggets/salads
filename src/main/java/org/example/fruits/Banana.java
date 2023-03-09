package org.example.fruits;

public class Banana extends Fruit{
    private static final int CALORIES = 200;
    private static final int PRICE = 20;
    @Override
    public int getCal() {
        return CALORIES;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }


}
