package com.netcracker.hometaskWithTriangle;

import com.netcracker.hometaskWithTriangle.triangles.Triangle;

import java.util.ArrayList;
import java.util.List;

public class TriangleHolder {
    private final List<Triangle> triangles = new ArrayList<>();

    public TriangleHolder addTriangle(Triangle triangle) {
        triangles.add(triangle);
        return this;
    }

    public List<Triangle> getTriangles() {
        return triangles;
    }
}
