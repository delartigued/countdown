package com.countdown.generators;

import com.countdown.enums.Operators;

import java.util.Random;

public class Target {
    private final int[] numbers;
    private Random random = new Random();
    private int total = 0;

    public Target(int[] numbers){
        this.numbers = numbers;
    }

    public int generate() {

        while(total < 100 || total > 999){
            total = 0;
            loop();
        }

        return total;
    }

    private void loop(){
        for (int i = 0; i < numbers.length - 1; i = i + 2) {
            Operators operation = Operators.values()[random.nextInt(Operators.values().length)];
            switch (operation) {
                case ADD:
                    addNumbers(numbers[i], numbers[i + 1]);
                    break;
                case SUBTRACT:
                    subtractNumbers(numbers[i], numbers[i + 1]);
                    break;
                case DIVIDE:
                    divideNumbers(numbers[i], numbers[i + 1]);
                    break;
                case MULTIPLY:
                    multiplyNumbers(numbers[i], numbers[i + 1]);
                    break;
                default:
                    break;
            }

        }
    }

    private void multiplyNumbers(int x, int y) {
        total += x * y;
    }

    private void divideNumbers(int x, int y) {
        if (x % y == 0) {
            total += x / y;
        } else {
            subtractNumbers(x, y);
        }
    }

    private void subtractNumbers(int x, int y) {
        total += x - y;
    }

    private void addNumbers(int x, int y) {
        total += x + y;
    }


}
