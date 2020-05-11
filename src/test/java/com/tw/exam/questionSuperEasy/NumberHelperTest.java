package com.tw.exam.questionSuperEasy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberHelperTest {
    @Test
    void should_get_0_if_first_is_13() {
        assertEquals(0, NumberHelper.luckyNumber(13, 2, 3));
    }

    @Test
    void should_get_0_if_first_is_13_2() {
        assertEquals(0, NumberHelper.luckyNumber(13, 2, 13));
    }

    @Test
    void should_get_0_if_first_is_13_3() {
        assertEquals(0, NumberHelper.luckyNumber(13, 13, 2));
    }

    @Test
    void should_get_first_number_if_second_is_13() {
        assertEquals(1, NumberHelper.luckyNumber(1, 13, 3));
    }

    @Test
    void should_get_first_number_if_second_and_third_is_13() {
        assertEquals(1, NumberHelper.luckyNumber(1, 13, 13));
    }

    @Test
    void should_get_sum_of_first_2_number() {
        assertEquals(3, NumberHelper.luckyNumber(1, 2, 13));
    }

    @Test
    void should_get_sum_if_none_is_13() {
        assertEquals(13, NumberHelper.luckyNumber(6, 5, 2));
    }

    @Test
    void should_get_sum_if_none_is_13_2() {
        assertEquals(6, NumberHelper.luckyNumber(1, 2, 3));
    }
}