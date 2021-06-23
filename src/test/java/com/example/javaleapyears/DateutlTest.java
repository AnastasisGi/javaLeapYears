package com.example.javaleapyears;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Date;

import org.junit.jupiter.api.Test;

public class DateutlTest {
    @Test

    public void normalLeapYearIsLeap() {
        assertTrue(DateUtl.isLeapYear(1992));
    }

    @Test
    public void nonLeapYearIsNotLeap() {
        assertFalse(DateUtl.isLeapYear(1991));
    }

    @Test
    public void normalLeapYearIsLeapexampl2() {
        assertTrue(DateUtl.isLeapYear(1996));
    }

    @Test
    public void centuryYearsAreNotLeapYears() {
        assertFalse(DateUtl.isLeapYear(1900));
    }

    @Test
    public void mileniumYearIsLeap() {
        assertTrue(DateUtl.isLeapYear(2000));
    }
}