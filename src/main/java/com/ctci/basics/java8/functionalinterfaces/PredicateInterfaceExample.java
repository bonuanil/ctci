package com.ctci.basics.java8.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateInterfaceExample {

    public static void main(String[] args) {
        Predicate<String> simplePredicate = input -> "TEST".equals(input);

        System.out.println(simplePredicate.test("Hello"));
        System.out.println(simplePredicate.test("TEST"));

        // Predicate Chaining

        Predicate<Integer> lessThan = input -> input < 20;
        Predicate<Integer> greaterThan = input -> input > 10;

        System.out.println(greaterThan.and(lessThan).test(15));
        System.out.println(lessThan.and(greaterThan).negate().test(15));

    }

}
