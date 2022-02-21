package com.countdown.generator;

import java.util.Random;

public class SmallNumbers {
    final private Random random = new Random();

    public int[] generate(int length) {
        int[] smallNumbers = new int[length];

        for (int i = 0; i < smallNumbers.length; i++) {
            smallNumbers[i] = random.nextInt(8) + 1;
        }

        return smallNumbers;
    }
}
