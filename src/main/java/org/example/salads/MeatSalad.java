package org.example.salads;

import org.example.meat.Meat;
import org.example.veggies.Veggie;

import java.util.List;

public class MeatSalad extends Salad{
    public MeatSalad(List<Meat> meats, List<Veggie> vegmeat, int freshness) {
        super(freshness);
        products.addAll(vegmeat);
        products.addAll(meats);
    }
}
