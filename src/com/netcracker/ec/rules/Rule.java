package com.netcracker.ec.rules;

import com.netcracker.ec.InputStringProvider;

/**
 * Represents rule, which describes input string
 * @author alex_prus
 */
abstract public class Rule {
    public static final String PUNCTUATION_MARKS = ".,?!;:";
    public static final String NUMBERS = "0123456789";
    public static int countRules = 0;//count confirmed rules

    public abstract boolean checkString(InputStringProvider string);

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
