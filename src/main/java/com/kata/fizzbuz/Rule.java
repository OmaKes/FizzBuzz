package com.kata.fizzbuz;

public class Rule {
    private final FizzBuzzFunctionalInterface fizzBuzzFunctionalInterface;
    private final String ruleValue;

    public Rule(FizzBuzzFunctionalInterface fizzBuzzFunctionalInterface,
                String ruleValue) {
        this.fizzBuzzFunctionalInterface = fizzBuzzFunctionalInterface;
        this.ruleValue = ruleValue;
    }

    public boolean evaluate(int input) {
        return this.fizzBuzzFunctionalInterface.test(input);
    }

    public String getRuleValue() {
        return ruleValue;
    }
}
