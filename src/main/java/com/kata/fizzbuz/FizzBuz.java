package com.kata.fizzbuz;

public class FizzBuz {
    public static String execute(int input) {
        if (input % 3 == 0) {
            return "Fizz";
        }

        if (input % 5 == 0) {
            return "Buzz";
        }
        return null;
    }
}
