package org.example.service;

import java.util.ArrayList;
import java.util.List;

public class TriangleNumberService {

    public int computeTriangularNumber(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        if (n == 0) return 0;
        return n + computeTriangularNumber(n - 1);
    }

    public List<Integer> generateTriangularSequence(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        List<Integer> sequence = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sequence.add(computeTriangularNumber(i));
        }
        return sequence;
    }
}
