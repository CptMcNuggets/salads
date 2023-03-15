package org.example.salads;

import org.example.veggies.Veggie;

import java.util.ArrayList;
import java.util.List;

public class VeggieSalad extends Salad {
    public VeggieSalad(List<Veggie> veggieSalad, String country) {
        super(country);
        products.addAll(veggieSalad);
    }
}
