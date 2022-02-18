package com.countdown.generator;

import java.util.Random;

public class TargetGenerator {
    public static int newTarget() {
        Random random = new Random();
        return random.nextInt(1000) + 100;
    }
}
