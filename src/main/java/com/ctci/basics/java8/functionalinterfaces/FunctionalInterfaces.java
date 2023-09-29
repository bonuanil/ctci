package com.ctci.basics.java8.functionalinterfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfaces {

    public static void main(String[] args) {
        //This takes one arg and returns nothing
        Consumer<Integer> consumer = (value) -> System.out.println(value);
        //This takes 2 args and no return
        BiConsumer<String, Integer> biConsumer = (a , x) -> {
            System.out.println("a value = "+ a);
            System.out.println("x value = "+ x);
        };

        // In general, a predicate means a function that accepts an arg and returns a boolean
        // Good example to use is streams filtering
        Predicate predicate = (item) -> item != null;

        consumer.accept(10);
        biConsumer.accept("Hi", 12);
        System.out.println(predicate.test("str"));
    }
}
