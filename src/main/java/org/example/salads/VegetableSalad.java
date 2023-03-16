package org.example.salads;

import org.example.veggies.Vegetable;

import java.util.List;

public class VegetableSalad extends Salad {
    public VegetableSalad(List<Vegetable> vegetableSalad, String country) {
        super(country);
        products.addAll(vegetableSalad);
    }

    @Override
    public String toString() {
        return "Veggie salad from " + this.country;
    }
}
