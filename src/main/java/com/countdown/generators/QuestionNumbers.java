package com.countdown.generators;

import com.countdown.enums.NumberSize;
import com.countdown.enums.Operators;

import java.util.Random;

public class QuestionNumbers {
    private final LargeNumbers largeNumberGenerator = new LargeNumbers();
    private final SmallNumbers smallNumberGenerator = new SmallNumbers();
    private final Random random = new Random();
    private final int[] numbers = new int[6];

    public QuestionNumbers(){
    }

    public int[] generate() {
        int[] largeNumbers = largeNumberGenerator.generate();

        int[] smallNumbers = smallNumberGenerator.generate(6 - largeNumbers.length);

        return buildNumbersArr(largeNumbers, smallNumbers);
    }

    private int[] buildNumbersArr(int[] largeNumbers, int[] smallNumbers) {
        int largeNumberLength = largeNumbers.length - 1;
        int smallNumberLength = smallNumbers.length - 1;

        for (int i = 0; i < numbers.length; i++) {
            NumberSize selection = NumberSize.values()[random.nextInt(2)];
            if((selection == NumberSize.LARGE && largeNumberLength >= 0) || (selection == NumberSize.SMALL && smallNumberLength < 0)){
                numbers[i] = largeNumbers[largeNumberLength];
                largeNumberLength -= 1;
            } else if((selection == NumberSize.LARGE && largeNumberLength < 0) || (selection == NumberSize.SMALL && smallNumberLength >= 0)) {
                numbers[i] = smallNumbers[smallNumberLength];
                smallNumberLength -= 1;
            }
        }

        return numbers;
    }


}
