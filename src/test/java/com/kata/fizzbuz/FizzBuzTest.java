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
    @Test
    void shouldReturnFizzBuzzForFifteenInput() {
        // GIVEN
        int input = 15;
        String expected = "FizzBuzz";

        // WHEN
        String result = FizzBuz.execute(input);

        // THEN
        assertEquals(result, expected);
    }

    @Test
    void shouldReturnFizzBuzzForThirtyInput() {
        // GIVEN
        int input = 30;
        String expected = "FizzBuzz";

        // WHEN
        String result = FizzBuz.execute(input);

        // THEN
        assertEquals(result, expected);
    }

    @Test
    void shouldReturnFizzBuzzForFortyFiveInput() {
        // GIVEN
        int input = 45;
        String expected = "FizzBuzz";

        // WHEN
        String result = FizzBuz.execute(input);

        // THEN
        assertEquals(result, expected);
    }

    @Test
    void shouldReturnOneForOneInput() {
        // GIVEN
        int input = 1;
        String expected = "1";

        // WHEN
        String result = FizzBuz.execute(input);

        // THEN
        assertEquals(result, expected);
    }

    @Test
    void shouldReturnTwoForTwoInput() {
        // GIVEN
        int input = 2;
        String expected = "2";

        // WHEN
        String result = FizzBuz.execute(input);

        // THEN
        assertEquals(result, expected);
    }
}