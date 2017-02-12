package com.hillel.projects;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    int[] fibCache = new int[50];
    int lastIndex = 1;

    public Fibonacci() {
        fibCache[0] = 1;
        fibCache[1] = 1;
    }

    public int getElementAt(int position) {

        position--;

        if (fibCache[position] != 0) {
            return fibCache[position];
        }

        int first = fibCache[lastIndex - 1];
        int second = fibCache[lastIndex];

        for (int i = lastIndex + 1; i <= position; i++) {
            int current = first + second;
            first = second;
            second = current;

            fibCache[i] = current;
        }

        lastIndex = position;

        return second;
    }

    public BigInteger getBigIntegerElementAt(BigInteger position) {
        position = position.subtract(BigInteger.ONE);

        BigInteger first = BigInteger.ONE;
        BigInteger second = BigInteger.ONE;

        for (BigInteger i = BigInteger.valueOf(2);
             i.compareTo(position) <= 0;
             i = i.add(BigInteger.ONE)) {

            BigInteger current = first.add(second);
            first = second;
            second = current;
        }

        return second;
    }
}
