package com.ctci.basics.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class ReduceExample {

    public List<Integer> listOddNumbers(List<Integer> input) {
        if (input == null || input.isEmpty()) return new ArrayList<>();

        /**
         *
         * reduce
         *
         * Identity - element that is the initial value of the reduction
         * Accumulator - function takes 2 params
         *                   - 1st is the partial result of reduction
         *                   - 2nd is the next element of the stream
         * Combiner - we use if we want to execute in parallel
         *
         *
         */
        return input.stream().reduce(new ArrayList<Integer>(), (a, b) -> {
            if (b % 2 != 0)
                a.add(b);
            return a;
        }, (a, b) -> {
            a.addAll(b);
            return a;
        });
    }

    public int sumOfIntegers(List<Integer> input) {
        if (input == null || input.isEmpty()) return 0;

        //return input.stream().reduce(0, (subtotal, nextElem) -> subtotal + nextElem);
        return input.stream().reduce(0, Integer::sum);
    }
}