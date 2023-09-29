package com.ctci.basics.java8.functionalinterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample {

    public static void main(String[] args) {
        Consumer<String> consumer = (input) -> System.out.println(input);
        consumer.accept("Hello Dude!");

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("Initial List " + list);

        Consumer<List<Integer>> updateList = input -> {
            int i=0;
            while (i<input.size()){
                input.set(i, 2* list.get(i));
                i++;
            }
        };

        Consumer<List<Integer>> displayList = input -> {
            input.forEach( item -> System.out.print(item + " "));
        };

        updateList.accept(list);
        System.out.println("After Modification " + list);

        displayList.accept(list);
        System.out.println("");
        System.out.println("andThen - test ");
        // andThen -> consumer on consumer
        updateList.andThen(displayList).accept(list);




    }
}
