package org.example.salads;

import org.example.veggies.Vegetable;

import java.util.List;

public class VegetableSalad extends Salad {
    public VegetableSalad(List<Vegetable> vegetableSalad, String country) {
        super(country);
        products.addAll(vegetableSalad);
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
