package com.netcracker.hometaskWithTriangle.triangles;

import java.util.List;

public class RightTriangle extends Triangle {
    @Override
    public boolean checkTriangle(List<Double> sidesOfTheTriangle) {
        double a = sidesOfTheTriangle.get(0);
        double b = sidesOfTheTriangle.get(1);
        double c = sidesOfTheTriangle.get(2);

        return Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2) ||
                Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2) ||
                Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2);
    }
}
