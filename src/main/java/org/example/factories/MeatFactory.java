package org.example.factories;

import org.example.meat.Beef;
import org.example.meat.Fish;
import org.example.meat.Meat;
import org.example.meat.Pork;

import java.util.List;

public class MeatFactory extends ProductFactory {

    private static final Class[] meat = {Pork.class, Beef.class, Fish.class};
    public MeatFactory(int minAmount, int maxAmount) {
        super(minAmount, maxAmount);
    }

    @Override
    public List<Meat> getProductList() {
        return (List<Meat>) getRandomProducts(meat);
    }

}
