package org.example.model;

import org.example.service.TriangleNumberService;
import java.util.List;

public class TriangleNumberCalculator {

    private final TriangleNumberService service;

    public TriangleNumberCalculator() {
        this.service = new TriangleNumberService();
    }

    public int value(int n) {
        return service.computeTriangularNumber(n);
    }

    public int add(int n, int m) {
        return value(n) + value(m);
    }

    public int subtract(int n, int m) {
        return value(n) - value(m);
    }

    public int multiply(int n, int m) {
        return value(n) * value(m);
    }

    public double divide(int n, int m) {
        int denominator = value(m);
        if (denominator == 0) throw new ArithmeticException("Cannot divide by zero.");
        return (double) value(n) / denominator;
    }

    public List<Integer> sequence(int n) {
        return service.generateTriangularSequence(n);
    }
}
