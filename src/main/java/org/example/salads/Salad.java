package org.example.salads;

import org.example.Constants;
import org.example.Product;

import java.util.ArrayList;
import java.util.List;

public abstract class Salad {
    public String country;
    public Salad(String country) {
        this.country = country;
    }
    public String getCountry() {
        return country;
    }
    public List<Product> products = new ArrayList<>();
    public int totalPrice() {
        int totalPrice = 0;
        for (Product item: products) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
    public int totalCal() {
      int totalCal = 0;
      for (Product item: products) {
          totalCal += item.getCal();
      }
      return totalCal;
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
