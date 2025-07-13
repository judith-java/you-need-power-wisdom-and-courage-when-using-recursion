package org.example;

import org.example.model.TriangleNumberCalculator;

public class Main {
    public static void main(String[] args) {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();

        System.out.println(calculator.value(1)); // 1
        System.out.println(calculator.value(2)); // 3
        System.out.println(calculator.value(4)); // 10

        System.out.println(calculator.add(1, 1)); // 2
        System.out.println(calculator.add(2, 3)); // 9
        System.out.println(calculator.add(4, 2)); // 13

        System.out.println(calculator.subtract(1, 1)); // 0
        System.out.println(calculator.subtract(2, 3)); // -3
        System.out.println(calculator.subtract(4, 2)); // 7

        System.out.println(calculator.multiply(2, 3)); // 18
        System.out.println(calculator.divide(4, 2));   // 3.333...

        System.out.println(calculator.sequence(5)); // [1, 3, 6, 10, 15]
    }
}
