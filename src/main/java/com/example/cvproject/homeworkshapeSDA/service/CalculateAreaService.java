package com.example.cvproject.homeworkshapeSDA.service;

import com.example.cvproject.homeworkshapeSDA.shape.Shape;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalculateAreaService {

    private final Shape shape;

    public void calculateAreaOfSquare() {
        System.out.println("START - calculate area for " + shape.getClass());
        double area = shape.calculateArea();
        System.out.println("Finish - calculated result is  " + area);
    }
}
