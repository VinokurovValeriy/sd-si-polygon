package com.netcracker.ec.triangles;

import java.util.List;

public class IsoscelesTriangle extends Triangle {

    @Override
    public boolean checkTriangleType(List<Double> edges) {
        double firstEdge = edges.get(0);
        double secondEdge = edges.get(1);
        double thirdEdge = edges.get(2);
        return firstEdge == secondEdge ||
                secondEdge == thirdEdge ||
                thirdEdge == firstEdge;
    }
}
