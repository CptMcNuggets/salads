package org.example;

import org.example.fruits.Apple;
import org.example.fruits.Banana;
import org.example.fruits.Fruit;
import org.example.fruits.Orange;
import org.example.meat.Meat;
import org.example.meat.Pork;
import org.example.salads.FruitSalad;
import org.example.salads.MeatSalad;
import org.example.salads.Salad;
import org.example.salads.VeggieSalad;
import org.example.veggies.Cucumber;
import org.example.veggies.Tomato;
import org.example.veggies.Veggie;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Создание листов с продуктами
        ArrayList<Fruit> fruits = new ArrayList<>();
        ArrayList<Veggie> veggies = new ArrayList<>();
        ArrayList<Veggie> vegmeat = new ArrayList<>();
        ArrayList<Meat> meat = new ArrayList<>();
        // Заполнение листов с продуктами
        fruits.add(new Banana());
        fruits.add(new Orange());
        fruits.add(new Apple());
        veggies.add(new Cucumber());
        veggies.add(new Tomato());
        vegmeat.add(new Tomato());
        meat.add(new Pork());
        // Создание "рецептов" салатов и наполнение их листами продуктов
        FruitSalad fruitSalad =  new FruitSalad(fruits, Constants.THAILAND);
        VeggieSalad veggieSalad = new VeggieSalad(veggies,Constants.GEORGIA);
        MeatSalad meatSaladNew = new MeatSalad(meat, veggies, Constants.FRANCE);
        MeatSalad meatSalad = new MeatSalad(meat, vegmeat, Constants.GEORGIA);
        // Создание листа со всеми салатами
        ArrayList<Salad> allSalads = new ArrayList<>();
        allSalads.add(meatSalad);
        allSalads.add(meatSaladNew);
        allSalads.add(fruitSalad);
        allSalads.add(veggieSalad);
        //Создание сета салатов
        HashSet<Salad> countrySalads = new HashSet<>();
        countrySalads.addAll(allSalads);
        String strSalad = countrySalads.toString();
        for (int i = 0; i < strSalad.length(); i++) {
            if (strSalad.charAt(i) == '[') {
                strSalad = strSalad.substring(i+1);
            }
            if (strSalad.charAt(i) == ']') {
                strSalad = strSalad.substring(0,i);
            }
        }

        System.out.println("We have salads from all over the world: " + strSalad);
        // Вывод результатов
        System.out.println("Total calories in Veggie Salad: " + veggieSalad.totalCal() + ". Price: " + veggieSalad.totalPrice());
        System.out.println("Total calories in Fruit Salad: " + fruitSalad.totalCal() + ". Price: " + fruitSalad.totalPrice());
        System.out.println("Total calories in Meat Salad: " + meatSalad.totalCal() + ". Price: " + meatSalad.totalPrice());

    }
}