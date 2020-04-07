package com.netcracker.ec.rules;

import com.netcracker.ec.InputStringProvider;

/**
 * Created by alex_prus on 9.10.16.
 */
public class OnlyNumbersRule extends Rule {
    /**
     * Check that input string contains of only numbers
     * @param string - object of InputStringProvider class, which contains string-field to check
     */
    @Override
    public boolean checkString(InputStringProvider string) {
        if ((string.getArrayOfInputString()).length > 1) {//if string has one ore more spaces
            return false;
        }
        else {
            if ((string.getArrayOfInputString()).length == 0) {//if string is empty
                return false;
            }
            else {
                char[] lettersArray = string.getArrayOfInputString()[0].toCharArray();
                for (char letter : lettersArray) {
                    if (NUMBERS.indexOf(letter) == -1) {//check for numbers in NUMBERS-string
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
