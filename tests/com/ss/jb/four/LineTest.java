package com.ss.jb.four;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    private Line l1 = new Line (0,0,10,5);
    private Line l2 = new Line (0,2, 12, 8);
    private Line l3 = new Line (0,0, 3, 4);
    private Line arrException = new Line (1, 3, 1, 6);

    @Test
    void getSlope() {
        assertEquals(0.5, l1.getSlope());
        assertThrows (ArithmeticException.class, () -> arrException.getSlope());
    }

    @Test
    void getDistance() {
        assertEquals(5, l3.getDistance());
    }

    @Test
    void parallelTo() {
        assertTrue (l1.parallelTo(l2));
    }
}