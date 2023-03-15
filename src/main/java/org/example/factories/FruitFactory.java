package org.example.factories;

import org.example.fruits.Apple;
import org.example.fruits.Banana;
import org.example.fruits.Fruit;
import org.example.fruits.Orange;

import java.util.List;

public class FruitFactory extends ProductFactory {

    public FruitFactory(int minAmount, int maxAmount) {
        super(minAmount, maxAmount);
    }

    private static final Class[] fruits = {Apple.class, Banana.class, Orange.class};

    @Override
    public List<Fruit> getProductList() {
        return (List<Fruit>) getRandomProducts(fruits);
    }
}
