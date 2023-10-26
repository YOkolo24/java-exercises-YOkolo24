package com.cbfacademy;

public class LeapYear {

    public static Boolean isLeapYear(int value) {
        if (value % 400 == 0) return true;

        return false;
    }
}
