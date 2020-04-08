package com.netcracker.hometaskWithTriangle;

import java.util.List;

public class CorrectnessOfTheParties {
    public static boolean isTriangle(List<Double> sidesOfTheTriangle) {
        double a = sidesOfTheTriangle.get(0);
        double b = sidesOfTheTriangle.get(1);
        double c = sidesOfTheTriangle.get(2);

        return (c < a + b && b < a + c && a < b + c);
    }
}
