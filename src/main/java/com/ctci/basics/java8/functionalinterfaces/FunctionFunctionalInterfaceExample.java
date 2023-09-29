package com.ctci.basics.java8.functionalinterfaces;

import java.util.function.Function;

public class FunctionFunctionalInterfaceExample {
    public static void main(String[] args) {
        Function<Integer, String> functionalInterface1 = input ->  "Hello Agent - " + input;

        System.out.println(functionalInterface1.apply(22));

        System.out.println(functionalInterface1.andThen( input -> input + " Welcome").apply(24));
        functionalInterface1 = functionalInterface1.compose(x -> 4 * x);

        System.out.println(functionalInterface1.apply(24));


    }
}
