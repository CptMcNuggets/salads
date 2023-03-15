package org.example;

import java.util.Random;

public class Utils {

    public static int getRandomIndex(Object[] arr) {
        return new Random().ints(0, arr.length).findFirst().getAsInt();
    }
}
