package com.kata.fizzbuz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final List<Rule> rules;

    static {
        Rule fizzRule = new Rule((givenInput) -> givenInput % 3 == 0, FIZZ);
        Rule buzzRule = new Rule((givenInput) -> givenInput % 5 == 0, BUZZ);
        rules = new ArrayList<>();
        rules.add(fizzRule);
        rules.add(buzzRule);
    }

    public static String execute(int input) {
        return rules.stream()
                .filter(rule -> rule.evaluate(input))
                .map(Rule::getRuleValue)
                .reduce(String::concat)
                .orElse(String.valueOf(input));
    }
}
