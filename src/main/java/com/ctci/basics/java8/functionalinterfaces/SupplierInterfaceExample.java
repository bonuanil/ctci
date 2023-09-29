package com.ctci.basics.java8.functionalinterfaces;

import java.util.function.Supplier;

public class SupplierInterfaceExample {
    // THis takes no input and returns a value
    // Example - Random no generator

    static Supplier<Double> supplier = () -> Math.random();

    public static void main(String[] args) {
        System.out.println(supplier.get());
    }
}
