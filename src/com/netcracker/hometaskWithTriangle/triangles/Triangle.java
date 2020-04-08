package com.netcracker.hometaskWithTriangle.triangles;

import java.util.List;

public abstract class Triangle {
    public abstract boolean checkTriangle(List<Double> sidesOfTheTriangle);

    @Override
    public String toString() {
        return getClass().toString();
    }
}