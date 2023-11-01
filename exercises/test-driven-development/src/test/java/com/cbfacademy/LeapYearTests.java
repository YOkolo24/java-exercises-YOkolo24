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
    
    @DisplayName("confirm whether a given year is a leap year or not")
    @ParameterizedTest
    @MethodSource
    
    public void returnsTrueWhenYearIsLeapYear(int year, Boolean expected) {
        final Boolean result = LeapYear.isLeapYear(year);
        assertThat(result, is(expected));
    }
    
    static Stream<Arguments> returnsTrueWhenYearIsLeapYear() {
        return Stream.of(
            arguments(1700, false),
            arguments(1800, false),
            arguments(1900, false),
            arguments(2000, true),
            arguments(2001, false),
            arguments(2002, false),
            arguments(2003, false), 
            arguments(2004, true),
            arguments(2005, false), 
            arguments(2006, false), 
            arguments(2007, false), 
            arguments(2008, true), 
            arguments(2009, false), 
            arguments(2010, false), 
            arguments(2011, false) 
              
        );
    }
}

