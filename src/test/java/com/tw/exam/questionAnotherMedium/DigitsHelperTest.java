package com.tw.exam.questionAnotherMedium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DigitsHelperTest {

    // Happy path

    @Test
    void should_calculate_sum_of_digits() {
        assertEquals(6, DigitsHelper.sumDigits("aa1bc2d3"));
    }

    @Test
    void should_calculate_sum_of_digits_1() {
        assertEquals(8, DigitsHelper.sumDigits("aa11b33"));
    }

    @Test
    void should_calculate_sum_of_digits_2() {
        assertEquals(0, DigitsHelper.sumDigits("Chocolate"));
    }

    @Test
    void should_calculate_sum_of_digits_3() {
        assertEquals(7, DigitsHelper.sumDigits("5hoco1a1e"));
    }

    @Test
    void should_calculate_sum_of_digits_4() {
        assertEquals(12, DigitsHelper.sumDigits("123abc123"));
    }

    @Test
    void should_calculate_sum_of_digits_5() {
        assertEquals(0, DigitsHelper.sumDigits(""));
    }

    @Test
    void should_calculate_sum_of_digits_6() {
        assertEquals(0, DigitsHelper.sumDigits("Hello"));
    }

    @Test
    void should_calculate_sum_of_digits_7() {
        assertEquals(12, DigitsHelper.sumDigits("X1z9b2"));
    }

    @Test
    void should_calculate_sum_of_digits_8() {
        assertEquals(14, DigitsHelper.sumDigits("5432a"));
    }

    // Sad path

    @Test
    void should_throw_if_text_is_null() {
        assertThrows(IllegalArgumentException.class, () -> DigitsHelper.sumDigits(null));
    }
}