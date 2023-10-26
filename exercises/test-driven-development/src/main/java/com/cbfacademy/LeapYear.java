package com.cbfacademy;

public class LeapYear {

    public static Boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;

        return false;
    }
}
