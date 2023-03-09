package org.example.fruits;

public class Orange extends Fruit{
    public static final int CALORIES = 150;
    public static final int PRICE = 15;


    @Override
    public int getCal() {
        return CALORIES;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }
}
