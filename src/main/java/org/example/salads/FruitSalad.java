package org.example.salads;

import org.example.fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitSalad extends Salad {
    public FruitSalad(List<Fruit> fruitSalad) {
        products = new ArrayList<>();
        products.addAll(fruitSalad);
    }
}
