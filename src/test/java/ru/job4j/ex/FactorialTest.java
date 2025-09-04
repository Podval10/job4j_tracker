package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {
    @Test
    public void whenException() {
        int number = 5;
        int expected = 120;
        int result = new  Factorial().calc(number);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void whenException1() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                  new   Factorial().calc(-1);
                });
        assertThat(exception.getMessage()).isEqualTo("Number could not be less than 0");

    }
}