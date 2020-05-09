package com.tw.exam.questionMedium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FizzBuzzTest {

    // Happy path

    @Test
    void should_get_fizz_and_buzz() {
        assertArrayEquals(
            new String[] {"1", "2", "Fizz", "4", "Buzz"},
            FizzBuzz.getFizzBuzz(1, 6)
        );
    }

    @Test
    void should_get_fizz_and_buzz_2() {
        assertArrayEquals(
            new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"},
            FizzBuzz.getFizzBuzz(1, 8)
        );
    }

    @Test
    void should_get_fizz_and_buzz_3() {
        assertArrayEquals(
            new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"},
            FizzBuzz.getFizzBuzz(1, 11)
        );
    }

    @Test
    void should_get_fizz_and_buzz_4() {
        assertArrayEquals(
            new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"},
            FizzBuzz.getFizzBuzz(1, 16)
        );
    }

    @Test
    void should_get_fizz_and_buzz_5() {
        assertArrayEquals(
            new String[] {"1", "2", "Fizz"},
            FizzBuzz.getFizzBuzz(1, 4)
        );
    }

    @Test
    void should_get_fizz_and_buzz_6() {
        assertArrayEquals(
            new String[] {"1", "2", "Fizz"},
            FizzBuzz.getFizzBuzz(1, 4)
        );
    }

    @Test
    void should_get_fizz_and_buzz_7() {
        assertArrayEquals(
            new String[] {"1"},
            FizzBuzz.getFizzBuzz(1, 2)
        );
    }

    @Test
    void should_get_fizz_and_buzz_8() {
        assertArrayEquals(
            new String[] {"Buzz", "Fizz", "52", "53", "Fizz", "Buzz"},
            FizzBuzz.getFizzBuzz(50, 56)
        );
    }

    @Test
    void should_get_fizz_and_buzz_9() {
        assertArrayEquals(
            new String[] {"FizzBuzz", "16"},
            FizzBuzz.getFizzBuzz(15, 17)
        );
    }

    @Test
    void should_get_fizz_and_buzz_10() {
        assertArrayEquals(
            new String[] {"FizzBuzz", "31", "32", "Fizz", "34", "Buzz"},
            FizzBuzz.getFizzBuzz(30, 36)
        );
    }

    @Test
    void should_get_fizz_and_buzz_11() {
        assertArrayEquals(
            new String[] {"Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz"},
            FizzBuzz.getFizzBuzz(1000, 1006)
        );
    }

    // Sad path

    @Test
    void should_throw_if_one_of_inputs_is_negative() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.getFizzBuzz(-1, 1));
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.getFizzBuzz(-2, -1));
    }

    @Test
    void should_throw_if_start_is_greater_than_end() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.getFizzBuzz(10, 1));
    }
}