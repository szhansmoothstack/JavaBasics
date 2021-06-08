package com.ss.jb.five;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Assignment5To7Test {
    private final Assignment5To7.Assignment5To7TestHook testHook = new Assignment5To7.Assignment5To7TestHook();

    @Test
    void printMonthLengthTest(){
        assertEquals ("JANUARY: 31 days\r\n" +
                "FEBRUARY: 29 days\r\n" +
                "MARCH: 31 days\r\n" +
                "APRIL: 30 days\r\n" +
                "MAY: 31 days\r\n" +
                "JUNE: 30 days\r\n" +
                "JULY: 31 days\r\n" +
                "AUGUST: 31 days\r\n" +
                "SEPTEMBER: 30 days\r\n" +
                "OCTOBER: 31 days\r\n" +
                "NOVEMBER: 30 days\r\n" +
                "DECEMBER: 31 days\r\n", testHook.printMonthLength(2016));
    }

    @Test
    void printMondaysTest (){
        assertEquals("2021-06-07\r\n" +
                "2021-06-14\r\n" +
                "2021-06-21\r\n" +
                "2021-06-28\r\n", testHook.printMondays("june"));
    }

    @Test
    void fridayTheThirteenthTest (){
        assertTrue (testHook.fridayTheThirteenth("august", 13));
        assertFalse (testHook.fridayTheThirteenth("june", 13));
    }
}