package com.netcracker.ec;

import com.netcracker.ec.triangles.EquilateralTriangle;
import com.netcracker.ec.triangles.IsoscelesTriangle;
import com.netcracker.ec.triangles.RightTriangle;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        InputEdgesProvider provider = new InputEdgesProvider();
        List<Double> edges = provider.getEdges();

        TriangleHolder triangleHolder = new TriangleHolder();
        triangleHolder.addTriangle(new IsoscelesTriangle())
                .addTriangle(new EquilateralTriangle())
                .addTriangle(new RightTriangle());

        triangleHolder.getTriangles().stream()
                .filter(triangle -> triangle.checkTriangleType(edges))
                .forEach(System.out::println);
    }
}
