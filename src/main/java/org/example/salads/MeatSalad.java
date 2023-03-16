package org.example.salads;

import org.example.meat.Meat;
import org.example.veggies.Vegetable;

import java.util.List;

public class MeatSalad extends Salad{
    public MeatSalad(List<Meat> meats, List<Vegetable> vegetables, String country) {
        super(country);
        products.addAll(vegetables);
        products.addAll(meats);
    }

    @Override
    public String toString() {
        return "Meat salad from " + this.country;
    }

}
