package org.example.salads;

import org.example.Constants;
import org.example.veggies.Veggie;

import java.util.ArrayList;
import java.util.List;

public class VeggieSalad extends Salad {
    public VeggieSalad(List<Veggie> veggieSalad, String country) {
        super(country);
        products.addAll(veggieSalad);
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

    @Override
    public String toString() {
        return "Veggie salad from " + this.country;
    }
}
