package com.netcracker.ec;

import com.netcracker.ec.triangles.Triangle;
import java.util.ArrayList;
import java.util.List;

public class TriangleHolder {
    private final List<Triangle> triangles = new ArrayList<>();

    public TriangleHolder addTriangle(Triangle rule) {
        triangles.add(rule);
        return this;
    }

    public List<Triangle> getTriangles() {
        return triangles;
    }
}
