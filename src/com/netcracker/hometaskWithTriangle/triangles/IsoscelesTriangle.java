package com.netcracker.hometaskWithTriangle.triangles;

import java.util.List;

public class IsoscelesTriangle extends Triangle {
    @Override
    public boolean checkTriangle(List<Double> sidesOfTheTriangle) {
        double a = sidesOfTheTriangle.get(0);
        double b = sidesOfTheTriangle.get(1);
        double c = sidesOfTheTriangle.get(2);

        return a == b || b == c || a == c;
    }
}