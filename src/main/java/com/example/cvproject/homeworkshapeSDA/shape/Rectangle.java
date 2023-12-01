package com.example.cvproject.homeworkshapeSDA.shape;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@ConditionalOnProperty(value = "shape.type", havingValue = "rectangle")
//@Primary
public class Rectangle implements Shape {
    Scanner scanner = new Scanner(System.in);

    @Override
    public double calculateArea() {
        System.out.println("Liczymy pole prostokąta! Podaj boki a oraz b: ");
        System.out.println("Podaj a: ");
        double a = scanner.nextDouble();
        System.out.println("Podaj b: ");
        double b = scanner.nextDouble();
        return a * b;
    }

    @Override
    public String getName() {
        return "rectangle";
    }
}
