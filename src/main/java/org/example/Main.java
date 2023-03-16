package org.example;

import org.example.factories.FruitFactory;
import org.example.factories.MeatFactory;
import org.example.factories.VegetableFactory;
import org.example.factories.salad_factories.FruitSaladFactory;
import org.example.factories.salad_factories.MeatSaladFactory;
import org.example.factories.salad_factories.VegetableSaladFactory;
import org.example.salads.Salad;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    private static final int MIN_PRODUCT_AMOUNT = 15;
    private static final int MAX_PRODUCT_AMOUNT = 30;

    public static void main(String[] args) {

        // Создание листа со всеми салатами

        ArrayList<Salad> allSalads = new ArrayList<>();
        allSalads.add(new FruitSaladFactory(MIN_PRODUCT_AMOUNT, MAX_PRODUCT_AMOUNT).getSalad());
        allSalads.add(new FruitSaladFactory(MIN_PRODUCT_AMOUNT, MAX_PRODUCT_AMOUNT).getSalad());
        allSalads.add(new FruitSaladFactory(MIN_PRODUCT_AMOUNT, MAX_PRODUCT_AMOUNT).getSalad());
        allSalads.add(new VegetableSaladFactory(MIN_PRODUCT_AMOUNT, MAX_PRODUCT_AMOUNT).getSalad());
        allSalads.add(new VegetableSaladFactory(MIN_PRODUCT_AMOUNT, MAX_PRODUCT_AMOUNT).getSalad());
        allSalads.add(new VegetableSaladFactory(MIN_PRODUCT_AMOUNT, MAX_PRODUCT_AMOUNT).getSalad());
        allSalads.add(new MeatSaladFactory(MIN_PRODUCT_AMOUNT, MAX_PRODUCT_AMOUNT).getSalad());
        allSalads.add(new MeatSaladFactory(MIN_PRODUCT_AMOUNT, MAX_PRODUCT_AMOUNT).getSalad());
        allSalads.add(new MeatSaladFactory(MIN_PRODUCT_AMOUNT, MAX_PRODUCT_AMOUNT).getSalad());

        //Создание сета салатов
        HashSet<Salad> countrySalads = new HashSet<>();
        countrySalads.addAll(allSalads);
        // Убираем скобки
        String strSalad = countrySalads.toString();
        for (int i = 0; i < strSalad.length(); i++) {
            if (strSalad.charAt(i) == '[') {
                strSalad = strSalad.substring(i + 1);
            }
            if (strSalad.charAt(i) == ']') {
                strSalad = strSalad.substring(0, i);
            }
        }

        // Вывод результатов
        System.out.println("We have salads from all over the world: " + strSalad);
    }


}