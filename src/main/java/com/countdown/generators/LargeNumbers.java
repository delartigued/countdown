package com.countdown.generators;

import java.util.Random;

public class LargeNumbers {
    final private Random random = new Random();
    final private int[] large = {25, 50, 75, 100};

    public int[] generate(){
        int[] largeNumbers = new int[quantity()];

        for (int i = 0; i < largeNumbers.length; i++) {
            largeNumbers[i] = large[random.nextInt(4)];
        }

        return largeNumbers;
    }

    private int quantity() {
        return random.nextInt(4) + 1;
    }
}
