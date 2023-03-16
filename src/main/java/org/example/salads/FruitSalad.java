package org.example.salads;

import org.example.fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitSalad extends Salad {
    public FruitSalad(List<Fruit> fruitSalad, String country) {
        super(country);
        products.addAll(fruitSalad);
    }
    @Override
    public String toString() {
        return "Fruit salad from " + this.country;
    }

}
