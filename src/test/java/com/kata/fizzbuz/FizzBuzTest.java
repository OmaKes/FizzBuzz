package com.kata.fizzbuz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzTest {

    @Test
    void shouldReturnFizz() {
        // GIVEN
        int input = 3;
        String expected = "Fizz";

        // WHEN
        String result = FizzBuz.execute(input);

        // THEN
        assertEquals(result, expected);
    }
}