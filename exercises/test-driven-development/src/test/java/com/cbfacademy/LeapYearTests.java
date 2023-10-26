package com.cbfacademy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("The LeapYear class should")
public class LeapYearTests {

    @Test
    @DisplayName("return true if year is divisible by 400")
    public void returnTrueWhenInputIsDivisibleBy400() {
        final boolean actual = LeapYear.isLeapYear(400);
        assertThat(actual, is(true));
    }
    
}

