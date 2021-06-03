package com.twsm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircularShiftTests {

    private static final String A_STRING = "ABCD";
    private static final String B_STRING = "BCDA";
    private static final String C_STRING = "CDAB";
    private static final String D_STRING = "DABC";

    @Test
    void shiftStringShouldThrownNullPointerExceptionWhenNullIsPassed() {
        Assertions.assertThrows(
                NullPointerException.class,
                () -> CircularShift.shiftString(null, 0, 0)
        );
    }

    @Test
    void shiftStringShouldReturnTheSameStringWhenPassedASingleCharacterLengthString() {
        var argument = "X";
        var shiftedString = CircularShift.shiftString(argument, 0, 0);

        Assertions.assertSame(shiftedString, argument);
    }

    @Test
    void shiftStringShouldReturnTheSameStringWhenLeftAndRightSumEqualZero() {
        var shifted = CircularShift.shiftString(A_STRING, 0, 0);
        Assertions.assertSame(shifted, A_STRING);

        shifted = CircularShift.shiftString(A_STRING, -1, -1);
        Assertions.assertSame(shifted, A_STRING);
    }

    @Test
    void shiftStringShouldReturnNewStringWhenLeftShift1() {
        var shifted = CircularShift.shiftString(A_STRING, 1, 0);
        Assertions.assertEquals(B_STRING, shifted);
    }

    @Test
    void shiftStringShouldReturnNewStringWhenLeftShift2() {
        var shifted = CircularShift.shiftString(A_STRING, 2, 0);
        Assertions.assertEquals(C_STRING, shifted);
    }

    @Test
    void shiftStringShouldReturnNewStringWhenLeftShift3() {
        var shifted = CircularShift.shiftString(A_STRING, 3, 0);
        Assertions.assertEquals(D_STRING, shifted);
    }

    @Test
    void shiftStringShouldReturnSameStringWhenLeftShift4() {
        var shifted = CircularShift.shiftString(A_STRING, 4, 0);
        Assertions.assertSame(shifted, A_STRING);
    }

    @Test
    void shiftStringShouldReturnNewStringWhenLeftShift5() {
        var shifted = CircularShift.shiftString(A_STRING, 5, 0);
        Assertions.assertEquals(B_STRING, shifted);
    }

    @Test
    void shiftStringShouldReturnNewStringWhenNegativeLeftShift1() {
        var shifted = CircularShift.shiftString(A_STRING, -1, 0);
        Assertions.assertEquals(D_STRING, shifted);
    }

    @Test
    void shiftStringShouldReturnNewStringWhenNegativeLeftShift2() {
        var shifted = CircularShift.shiftString(A_STRING, -2, 0);
        Assertions.assertEquals(C_STRING, shifted);
    }

    @Test
    void shiftStringShouldReturnNewStringWhenNegativeLeftShift3() {
        var shifted = CircularShift.shiftString(A_STRING, -3, 0);
        Assertions.assertEquals(B_STRING, shifted);
    }

    @Test
    void shiftStringShouldReturnSameStringWhenNegativeLeftShift4() {
        var shifted = CircularShift.shiftString(A_STRING, -4, 0);
        Assertions.assertSame(shifted, A_STRING);
    }

    @Test
    void shiftStringShouldReturnNewStringWhenNegativeLeftShift5() {
        var shifted = CircularShift.shiftString(A_STRING, -5, 0);
        Assertions.assertEquals(D_STRING, shifted);
    }

    @Test
    void shiftStringShouldReturnNewStringWhenRightShift1() {
        var shifted = CircularShift.shiftString(A_STRING, 0, 1);
        Assertions.assertEquals(D_STRING, shifted);
    }

    @Test
    void shiftStringShouldReturnNewStringWhenRightShift2() {
        var shifted = CircularShift.shiftString(A_STRING, 0, 2);
        Assertions.assertEquals(C_STRING, shifted);
    }

    @Test
    void shiftStringShouldReturnNewStringWhenRightShift3() {
        var shifted = CircularShift.shiftString(A_STRING, 0, 3);
        Assertions.assertEquals(B_STRING, shifted);
    }

    @Test
    void shiftStringShouldReturnSameStringWhenRightShift4() {
        var shifted = CircularShift.shiftString(A_STRING, 0, 4);
        Assertions.assertSame(shifted, A_STRING);
    }

    @Test
    void shiftStringShouldReturnNewStringWhenRightShift5() {
        var shifted = CircularShift.shiftString(A_STRING, 0, 5);
        Assertions.assertEquals(D_STRING, shifted);
    }

    @Test
    void shiftStringShouldReturnNewStringWhenNegativeRightShift1() {
        var shifted = CircularShift.shiftString(A_STRING, 0, -1);
        Assertions.assertEquals(B_STRING, shifted);
    }

    @Test
    void shiftStringShouldReturnNewStringWhenNegativeRightShift2() {
        var shifted = CircularShift.shiftString(A_STRING, 0, -2);
        Assertions.assertEquals(C_STRING, shifted);
    }

    @Test
    void shiftStringShouldReturnNewStringWhenNegativeRightShift3() {
        var shifted = CircularShift.shiftString(A_STRING, 0, -3);
        Assertions.assertEquals(D_STRING, shifted);
    }

    @Test
    void shiftStringShouldReturnSameStringWhenNegativeRightShift4() {
        var shifted = CircularShift.shiftString(A_STRING, 0, -4);
        Assertions.assertSame(shifted, A_STRING);
    }

    @Test
    void shiftStringShouldReturnNewStringWhenNegativeRightShift5() {
        var shifted = CircularShift.shiftString(A_STRING, 0, -5);
        Assertions.assertEquals(B_STRING, shifted);
    }

    @Test
    void shiftStringShouldReturnNewStringWhenLeft1Right2Shift() {
        var shifted = CircularShift.shiftString(A_STRING, 1, 2);
        Assertions.assertEquals(D_STRING, shifted);
    }

    @Test
    void shiftStringShouldReturnNewStringWhenLeft2Right1Shift() {
        var shifted = CircularShift.shiftString(A_STRING, 2, 1);
        Assertions.assertEquals(B_STRING, shifted);
    }

    @Test
    void shiftStringShouldReturnNewStringWhenNegativeLeft1Right2Shift() {
        var shifted = CircularShift.shiftString(A_STRING, -1, 2);
        Assertions.assertEquals(B_STRING, shifted);
    }

    @Test
    void shiftStringShouldReturnNewStringWhenLeft1NegativeRight2Shift() {
        var shifted = CircularShift.shiftString(A_STRING, 1, -2);
        Assertions.assertEquals(D_STRING, shifted);
    }
}
