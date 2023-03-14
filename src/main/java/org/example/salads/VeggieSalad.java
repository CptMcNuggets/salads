package org.example.salads;

import org.example.veggies.Veggie;

import java.util.List;

public class VeggieSalad extends Salad {
    public VeggieSalad(List<Veggie> veggieSalad, int freshness) {
        super(freshness);
        products.addAll(veggieSalad);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
