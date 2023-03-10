package org.example;

import org.example.fruits.Apple;
import org.example.fruits.Banana;
import org.example.fruits.Fruit;
import org.example.fruits.Orange;
import org.example.meat.Meat;
import org.example.meat.Pork;
import org.example.salads.FruitSalad;
import org.example.salads.MeatSalad;
import org.example.salads.VeggieSalad;
import org.example.veggies.Cucumber;
import org.example.veggies.Tomato;
import org.example.veggies.Veggie;

import java.util.ArrayList;

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
        FruitSalad fSalad =  new FruitSalad(fruits);
        VeggieSalad vSalad = new VeggieSalad(veggies);
        MeatSalad mSalad = new MeatSalad(meat, vegmeat);
        System.out.println("Total calories in Veggie Salad: " + vSalad.totalCal() + ". Price: " + vSalad.totalPrice());
        System.out.println("Total calories in Fruit Salad: " + fSalad.totalCal() + ". Price: " + fSalad.totalPrice());
        System.out.println("Total calories in Meat Salad: " + mSalad.totalCal() + ". Price: " + mSalad.totalPrice());


    }
}