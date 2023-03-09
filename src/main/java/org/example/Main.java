package org.example;

import org.example.fruits.Apple;
import org.example.fruits.Banana;
import org.example.fruits.Fruit;
import org.example.fruits.Orange;
import org.example.veggies.Cucumber;
import org.example.veggies.Tomato;
import org.example.veggies.Veggie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<>();
        FruitSalad fSalad =  new FruitSalad(fruits);
        fruits.add(new Banana());
        fruits.add(new Orange());
        fruits.add(new Apple());
        ArrayList<Veggie> veggies = new ArrayList<>();
        VeggieSalad vSalad = new VeggieSalad(veggies);
        veggies.add(new Cucumber());
        veggies.add(new Tomato());
        System.out.println("Total calories in Veggie Salad: " + vSalad.totalCal() + ". Price: " + vSalad.totalPrice());
        System.out.println("Total calories in Fruit Salad: " + fSalad.totalCal() + ". Price: " + fSalad.totalPrice());

    }
}