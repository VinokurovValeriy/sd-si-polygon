package com.netcracker.ec.triangles;

import java.util.List;

abstract public class Triangle {
    public static boolean isTriangle(List<Double> edges) {
        double firstEdge = edges.get(0);
        double secondEdge = edges.get(1);
        double thirdEdge = edges.get(2);
        return firstEdge + secondEdge > thirdEdge &&
                secondEdge + thirdEdge > firstEdge &&
                thirdEdge + firstEdge > secondEdge;
    }

    public abstract boolean checkTriangleType(List<Double> edges);

    @Override
    public String toString() {
        return "This is " + this.getClass().getSimpleName();
    }
}
