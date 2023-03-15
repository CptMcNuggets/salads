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
        return "Meat salad from " + this.country;
    }

}
