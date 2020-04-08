package com.netcracker.hometaskWithTriangle.view;

import com.netcracker.hometaskWithTriangle.util.UserInput;
import com.netcracker.hometaskWithTriangle.view.Printer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputSidesOfTheTriangleProvider {
    private List<Double> sidesOfTheTriangle;

    public InputSidesOfTheTriangleProvider() {
        sidesOfTheTriangle = new ArrayList<>();
        setInputSidesOfTheTriangle();
    }

    private void setInputSidesOfTheTriangle() {
        Printer.print("Enter the sides of the triangle: ");
        for (int i = 0; i < 3; i++) {
            sidesOfTheTriangle.add(UserInput.inputDouble("Enter the " + (i + 1) + " side: "));
        }
    }

    public List<Double> getSidesOfTheTriangle() {
        return sidesOfTheTriangle;
    }
}