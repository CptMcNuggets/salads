package org.example.salads;

import org.example.Product;

import java.util.ArrayList;
import java.util.List;

public abstract class Salad {
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
}
