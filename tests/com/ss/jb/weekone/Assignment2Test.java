package com.ss.jb.weekone;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Assignment2Test {
    private final Assignment2.Assignment2TestHook testHook = new Assignment2.Assignment2TestHook();

    @Test
    void rightDigitTest() {
        List<Integer> list1 = Arrays.asList(1, 22, 93);
        List<Integer> list2 = Arrays.asList(16, 8, 886, 8, 1);
        List<Integer> list3 = Arrays.asList(0, 0);
        assertEquals(Arrays.asList(1, 2, 3), testHook.rightDigit(list1));
        assertEquals(Arrays.asList(6, 8, 6, 8, 1), testHook.rightDigit(list2));
        assertEquals(Arrays.asList(0, 0), testHook.rightDigit(list3));
    }
}