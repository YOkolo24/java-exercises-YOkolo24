package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


@DisplayName("The FizzBuzz class should")
public class FizzBuzzTests {

    @Test
    @DisplayName("return 1 when the input is 1")
    public void return1WhenInputIs1() {
        final String actual = FizzBuzz.of(1);
        assertThat(actual, is("1"));
    }
    @Test
    @DisplayName("return 'Fizz' when the input is 3")
    public void returnFizzWhenInputIs3() {
        final String actual = FizzBuzz.of(3);
        assertThat(actual, is("Fizz"));
    } 
}
