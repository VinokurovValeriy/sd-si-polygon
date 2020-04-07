package com.netcracker.ec.rules;

import com.netcracker.ec.InputStringProvider;

/**
 * Rule, which checks input string of numbers include
 * @author alex_prus
 */
public class NoNumbersRule extends Rule {
    public boolean checkString(InputStringProvider string) {
        for (String word : string.getArrayOfInputString()) {
            char[] lettersArray = (word.toCharArray());
            for (char letter : lettersArray) {
                if (NUMBERS.indexOf(letter) != -1) {//if contains ony numbers, break out two cycles
                    return false;
                }
            }
        }
        return true;
    }
}
