package com.countdown;

import com.countdown.generators.QuestionNumbers;
import com.countdown.generators.Target;

public class Main {
    public static void main(String[] args) {
        QuestionNumbers questionNumbers = new QuestionNumbers();
        int[] numbers = questionNumbers.generate();

        Target target = new Target(numbers);

        target.generate();
    }
}
