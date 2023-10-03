package com.kata.fizzbuz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzTest {

    @Test
    void shouldReturnFizzForThreeInput() {
        // GIVEN
        int input = 3;
        String expected = "Fizz";

        // WHEN
        String result = FizzBuz.execute(input);

        // THEN
        assertEquals(result, expected);
    }

    @Test
    void shouldReturnFizzForSixInput() {
        // GIVEN
        int input = 6;
        String expected = "Fizz";

        // WHEN
        String result = FizzBuz.execute(input);

        // THEN
        assertEquals(result, expected);
    }
    @Test
    void shouldReturnFizzForNineInput() {
        // GIVEN
        int input = 9;
        String expected = "Fizz";

        // WHEN
        String result = FizzBuz.execute(input);

        // THEN
        assertEquals(result, expected);
    }

    @Test
    void shouldReturnBuzzForFiveInput() {
        // GIVEN
        int input = 5;
        String expected = "Buzz";

        // WHEN
        String result = FizzBuz.execute(input);

        // THEN
        assertEquals(result, expected);
    }

    @Test
    void shouldReturnBuzzForTenInput() {
        // GIVEN
        int input = 10;
        String expected = "Buzz";

        // WHEN
        String result = FizzBuz.execute(input);

        // THEN
        assertEquals(result, expected);
    }

    @Test
    void shouldReturnBuzzForTwentyFiveInput() {
        // GIVEN
        int input = 25;
        String expected = "Buzz";

        // WHEN
        String result = FizzBuz.execute(input);

        // THEN
        assertEquals(result, expected);
    }
}