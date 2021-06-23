package com.example.javaleapyears;

public class DateUtl {

    public static boolean isLeapYear(int year) {

        int divisor;
        return isDivisibleBy(year, 4) && !isDivisibleBy(year, 100) || isDivisibleBy(year, 400);
    }

    private static boolean isDivisibleBy(int year, int divisor) {
        return year % divisor == 0;
    }

}
