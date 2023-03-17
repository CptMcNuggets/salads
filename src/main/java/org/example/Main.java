package org.example;

import org.example.factories.FruitFactory;
import org.example.factories.MeatFactory;
import org.example.factories.VegetableFactory;
import org.example.factories.salad_factories.FruitSaladFactory;
import org.example.factories.salad_factories.MeatSaladFactory;
import org.example.factories.salad_factories.SaladFactory;
import org.example.factories.salad_factories.VegetableSaladFactory;
import org.example.fruits.Apple;
import org.example.fruits.Banana;
import org.example.fruits.Orange;
import org.example.salads.FruitSalad;
import org.example.salads.MeatSalad;
import org.example.salads.Salad;
import org.example.salads.VegetableSalad;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Main {
    private static final int MIN_PRODUCT_AMOUNT = 15;
    private static final int MAX_PRODUCT_AMOUNT = 30;
    private static final int MIN_SALADS = 3;
    private static final int MAX_SALADS = 7;
    public static final Class[] salads = {FruitSaladFactory.class, MeatSaladFactory.class, VegetableSaladFactory.class};
    public static List<Salad> getRandomSalads (Class[] saladClassArray) {
        int amount = new Random().ints(MIN_SALADS, MAX_SALADS).findFirst().getAsInt();
        List<Salad> rvList = new ArrayList<>();
        try {
            for (int i = 0; i < amount; i++) {
                int index = new Random().ints(0,saladClassArray.length).findFirst().getAsInt();
                Object factory = saladClassArray[index].getDeclaredConstructor(int.class,int.class).newInstance(MIN_PRODUCT_AMOUNT, MAX_PRODUCT_AMOUNT);
                SaladFactory saladFactory = (SaladFactory) factory;
                rvList.add(saladFactory.getSalad());
            }
        } catch (IllegalArgumentException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            System.out.println(e.getLocalizedMessage());
        }
        return rvList;
    }
    public static void main(String[] args) {
        System.out.println("All our salads: " + getRandomSalads(salads));
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
        //System.out.println("We have salads from all over the world: " + strSalad);
    }


}