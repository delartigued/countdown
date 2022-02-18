package com.countdown;

import com.countdown.generator.QuestionNumbers;
import com.countdown.generator.TargetGenerator;

public class Main {
    public static void main(String[] args) {
        QuestionNumbers.generateNumbers(TargetGenerator.newTarget());
    }
}
