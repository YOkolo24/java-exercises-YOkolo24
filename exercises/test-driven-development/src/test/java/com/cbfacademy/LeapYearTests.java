package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.stream.Stream;

@DisplayName("The LeapYear class should")
public class LeapYearTests {
    
    @DisplayName("return true if year is divisible by 400")
    @ParameterizedTest
    @MethodSource
    
    public void returnsTrueWhenYearIsDivisibleBy400(int year, Boolean expected) {
        final Boolean result = LeapYear.isLeapYear(year);
        assertThat(result, is(expected));
    }
    
    static Stream<Arguments> returnsTrueWhenYearIsDivisibleBy400() {
        return Stream.of(
            arguments(1600, true),
            arguments(1700, false),
            arguments(1800, false),
            arguments(1900, false),
            arguments(2000, true),
            arguments(2200, false),
            arguments(2400, true)   
        );
    }
    
    @DisplayName("return true if year is divisible by 100")
    @ParameterizedTest
    @MethodSource
    public void returnsTrueWhenYearIsDivisibleBy100(int year, Boolean expected) {
        final Boolean result = LeapYear.isLeapYear(year);
        assertThat(result, is(expected));
    }
    
    static Stream<Arguments> returnsTrueWhenYearIsDivisibleBy100() {
        return Stream.of(
             arguments(1600, false),
            arguments(1700, false),
            arguments(1800, false),
            arguments(1900, false),
            arguments(2000, false),
            arguments(2200, false),
            arguments(2400, false)    
        );
    }
}

