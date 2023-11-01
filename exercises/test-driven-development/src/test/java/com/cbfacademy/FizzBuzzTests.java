package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@DisplayName("The FizzBuzz class should")
public class FizzBuzzTests {

    @ParameterizedTest
    @MethodSource("inputAndOutput")
    @DisplayName("return expected value")
    public void returnExpectedValue(Integer value, String expected) {
        final String actual = FizzBuzz.of(value);
        assertThat(actual, is(expected));
    }
    static Stream<Arguments> inputAndOutput() {
        return Stream.of(
            arguments(1, "1"),
            arguments(2, "2"),
            arguments(3, "Fizz"),
            arguments(4, "4"),
            arguments(5, "Buzz"),
            arguments(6, "Fizz"),
            arguments(7, "7"),
            arguments(8, "8"),
            arguments(9, "Fizz"),
            arguments(10, "Buzz"),
            arguments(11, "11"),
            arguments(12, "Fizz"),
            arguments(13, "13"),
            arguments(14, "14"),
            arguments(15, "FizzBuzz")
        );
    }
}
