package com.netcracker.hometaskWithTriangle.triangles;

import java.util.List;

public class RightTriangle extends Triangle {
    @Override
    public boolean checkTriangle(List<Double> sidesOfTheTriangle) {
        double a = sidesOfTheTriangle.get(0);
        double b = sidesOfTheTriangle.get(1);
        double c = sidesOfTheTriangle.get(2);

        return checkRightTriangle(a, b, c) ||
                checkRightTriangle(b, c, a) ||
                checkRightTriangle(c, a, b);
    }

    private boolean checkRightTriangle(double a, double b, double c) {
        return Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2);
    }
}
