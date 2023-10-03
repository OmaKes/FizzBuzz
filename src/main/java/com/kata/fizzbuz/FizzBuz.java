package com.kata.fizzbuz;

public class FizzBuz {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static String execute(int input) {
        StringBuilder inputRepresentation = new StringBuilder();

        fizzCase(input, inputRepresentation);
        buzzCase(input, inputRepresentation);

        if (inputRepresentation.length() == 0) {
            inputRepresentation.append(input);
        }
        return inputRepresentation.toString();
    }

    private static void buzzCase(int input, StringBuilder inputRepresentation) {
        if (input % 5 == 0) {
            inputRepresentation.append(BUZZ);
        }
    }

    private static void fizzCase(int input, StringBuilder inputRepresentation) {
        if (input % 3 == 0) {
            inputRepresentation.append(FIZZ);
        }
    }
}
