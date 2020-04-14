package com.netcracker.ec.triangles;

import java.util.List;

public class RightTriangle extends Triangle {

    @Override
    public boolean checkTriangleType(List<Double> edges) {
        double firstEdge = edges.get(0);
        double secondEdge = edges.get(1);
        double thirdEdge = edges.get(2);
        return checkRightTriangle(firstEdge, secondEdge, thirdEdge) ||
                checkRightTriangle(secondEdge, thirdEdge, firstEdge) ||
                checkRightTriangle(thirdEdge, firstEdge, secondEdge);
    }

    public boolean checkRightTriangle(double a, double b, double c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }
}
