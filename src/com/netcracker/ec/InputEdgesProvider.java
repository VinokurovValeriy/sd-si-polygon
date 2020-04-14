package com.netcracker.ec;

import com.netcracker.ec.triangles.Triangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputEdgesProvider {
    private final List<Double> edges;

    public InputEdgesProvider() {
        edges = new ArrayList<>();
        InputEdges();
    }

    public List<Double> getEdges() {
        return edges;
    }

    private void InputEdges() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter side №" + i);
            edges.add(scanner.nextDouble());
        }
        if (!Triangle.isTriangle(edges)) {
            System.out.println("It's not a triangle,enter sides one more time.");
            edges.clear();
            InputEdges();
        }
        scanner.close();
    }
}
