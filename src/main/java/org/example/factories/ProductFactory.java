package org.example.factories;

import org.example.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.example.Utils.getRandomIndex;

public abstract class ProductFactory {
    public ProductFactory(int minAmount, int maxAmount) {
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
    }

    protected final int minAmount;
    protected final int maxAmount;

    protected List<? extends Product> getRandomProducts(Class[] productClassArray) {
        int amount = new Random().ints(minAmount, maxAmount).findFirst().getAsInt();
        List<Product> rv = new ArrayList<>();
        try {
            for (int i = 0; i < amount; i++) {
                rv.add((Product) productClassArray[getRandomIndex(productClassArray)].newInstance());
            }
        } catch (InstantiationException | IllegalAccessException e) {
            System.out.println(e.getLocalizedMessage());
        }
        return rv;
    }

    public abstract List<? extends Product> getProductList();

}
