package com.netcracker.hometaskWithTriangle;

import com.netcracker.hometaskWithTriangle.triangles.EquilateralTriangle;
import com.netcracker.hometaskWithTriangle.triangles.IsoscelesTriangle;
import com.netcracker.hometaskWithTriangle.triangles.RightTriangle;
import com.netcracker.hometaskWithTriangle.triangles.Triangle;
import com.netcracker.hometaskWithTriangle.view.InputSidesOfTheTriangleProvider;
import com.netcracker.hometaskWithTriangle.view.Printer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputSidesOfTheTriangleProvider sidesOfTheTriangleProvider = new InputSidesOfTheTriangleProvider();
        List<Double> sidesOfTheTriangle = sidesOfTheTriangleProvider.getSidesOfTheTriangle();

        if (!CorrectnessOfTheParties.isTriangle(sidesOfTheTriangle)) {
            Printer.print("It is not a triangle!");
            System.exit(0);
        }

        TriangleHolder triangleHolder = new TriangleHolder();
        triangleHolder.addTriangle(new RightTriangle())
                .addTriangle(new EquilateralTriangle())
                .addTriangle(new IsoscelesTriangle());


        triangleHolder.getTriangles().stream()
                .filter(triangle -> triangle.checkTriangle(sidesOfTheTriangle))
                .forEach(System.out::println);
    }
}


