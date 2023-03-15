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
    public int hashCode() {
        return 42 * country.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Salad)) {
            return false;
        }
        return country == ((Salad)obj).country;
    }
}
