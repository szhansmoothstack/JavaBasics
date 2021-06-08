package com.ss.jb.weekone;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Assignment3Test {
    private final Assignment3.Assignment3TestHook testHook = new Assignment3.Assignment3TestHook();

    @Test
    void doublingTest (){
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(6, 8, 6, 8, -1);
        List<Integer> list3 = Collections.emptyList();
        assertEquals(Arrays.asList(2, 4, 6), testHook.doubling(list1));
        assertEquals(Arrays.asList(12, 16, 12, 16, -2), testHook.doubling(list2));
        assertEquals(Collections.emptyList(), testHook.doubling(list3));
    }
}