package com.tw.exam.questionEasy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {
    // Happy paths

    @Test
    void should_create_string_using_first_and_last_n_character() {
        final String result = StringHelper.firstAndLastCharacters("Hello", 2);
        assertEquals("Helo", result);
    }

    @Test
    void should_create_string_using_first_and_last_n_character_2() {
        final String result = StringHelper.firstAndLastCharacters("Chocolate", 3);
        assertEquals("Choate", result);
    }

    @Test
    void should_create_string_using_first_and_last_n_character_3() {
        final String result = StringHelper.firstAndLastCharacters("Chocolate", 1);
        assertEquals("Ce", result);
    }

    @Test
    void should_create_string_using_first_and_last_n_character_4() {
        final String result = StringHelper.firstAndLastCharacters("Code", 2);
        assertEquals("Code", result);
    }

    // Corner cases

    @Test
    void should_return_empty_string_if_count_is_zero() {
        final String result = StringHelper.firstAndLastCharacters("Chocolate", 0);
        assertEquals("", result);
    }

    @Test
    void should_return_emtpy_string_if_count_is_zero_and_input_is_empty_string() {
        final String result = StringHelper.firstAndLastCharacters("", 0);
        assertEquals("", result);
    }

    @Test
    void should_create_string_when_count_is_larger_than_half_of_the_string() {
        final String result = StringHelper.firstAndLastCharacters("Hello", 4);
        assertEquals("Hellello", result);
    }

    @Test
    void should_create_string_when_count_is_the_length_of_the_string() {
        final String result = StringHelper.firstAndLastCharacters("Code", 4);
        assertEquals("CodeCode", result);
    }

    // Sad path

    @Test
    void should_throw_if_input_string_is_null() {
        final IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class, () -> StringHelper.firstAndLastCharacters(null, 0));
        assertEquals("The text cannot be null.", exception.getMessage());
    }

    @Test
    void should_throw_if_count_is_negative() {
        final IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class, () -> StringHelper.firstAndLastCharacters("Hello", -1));
        assertEquals("Invalid count.", exception.getMessage());
    }

    @Test
    void should_throw_if_count_is_greater_than_text_length() {
        final IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class, () -> StringHelper.firstAndLastCharacters("Hello", 100));
        assertEquals("Invalid count.", exception.getMessage());
    }
}