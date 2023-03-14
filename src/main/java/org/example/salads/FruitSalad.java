package org.example.salads;

import org.example.fruits.Fruit;

import java.util.List;

public class FruitSalad extends Salad {
    public FruitSalad(List<Fruit> fruitSalad, int freshness) {
        super(freshness);
        products.addAll(fruitSalad);
    }
}
