package com.iks;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final Map<Integer, String> fizzBuzzMap = new HashMap<>() {{
        put(3, "Fizz");
        put(5, "Buzz");
        put(7, "Whizz");
    }};

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    public static String fizzBuzz(int i) {
        String iAsString = String.valueOf(i);
        StringBuilder result = new StringBuilder();
        fizzBuzzMap.forEach((key, value) -> {
            if (i % key == 0 || iAsString.contains(key.toString())) {
                result.append(value);
            }
        });

        return result.length() < 1 ?
                String.valueOf(i) :
                result.toString();
    }

}
