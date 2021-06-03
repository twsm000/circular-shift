package com.twsm;

import java.util.Objects;

public class CircularShift {
    public static String shiftString(String value, int left, int right) {
        Objects.requireNonNull(value, "Non null value requited");

        if (value.length() == 1 || (left - right) == 0) {
            return value;
        }

        if (left < 0) {
            right += Math.abs(left);
            left = 0;
        }
        if (right < 0) {
            left += Math.abs(right);
            right = 0;
        }

        int index = (left - right) % value.length();
        if (index == 0) {
            return value;
        } else if (index < 0) {
            index = value.length() - (Math.abs(index) % value.length());
        }

        return value.substring(index) + value.substring(0, index);
    }
}
