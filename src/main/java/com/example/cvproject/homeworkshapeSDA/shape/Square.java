package com.example.cvproject.homeworkshapeSDA.shape;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@ConditionalOnProperty(value = "shape.type", havingValue = "square")
public class Square implements Shape {
    Scanner scanner = new Scanner(System.in);

    @Override
    public double calculateArea() {
        System.out.println("Liczymy pole kwadratu! Podaj bok a: ");
        double a = scanner.nextDouble();
        return Math.pow(a, 2);
    }

    @Override
    public String getName() {
        return "square";
    }
}
