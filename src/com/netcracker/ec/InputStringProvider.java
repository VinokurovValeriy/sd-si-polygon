package com.netcracker.ec;

import java.util.Scanner;

/**
 * Inputs string and outs link on stringArray
 * @author alex_prus
 */
public class InputStringProvider {
    private String[] arrayOfInputString;

    public InputStringProvider() {
        setInputString();
    }

    /**
     * Input string from keyboard
     */
    private void setInputString() {
        System.out.println("Enter any string!");
        Scanner sc = new Scanner(System.in);
        arrayOfInputString = (sc.nextLine()).split(" ");//Divide input string into stringArray
    }

    /**
     * Return link if input string
     * @return link on field of input string
     */
    public String[] getArrayOfInputString() {
        return arrayOfInputString;
    }
}
