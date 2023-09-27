package com.ctci.basics.java8.lambda;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {


    public static <T> List<T> filterDataOnCondition(List<T> data, Predicate<T> predicate){

        Collection<T> collection = new ArrayList<>();

        for (T t : data) {
            if (!predicate.test(t)) {
                collection.add(t);
            }
        }

        // Print the list
        System.out.println("Collection to be removed: " + collection);

        // Removing 10 using List.removeAll()
        // passing a collection
        data.removeAll(collection);


        return data;
    }





    public static <T> List<T> filterUsingStream(List<T> data, Predicate<T> predicate){
        return data.stream().filter(predicate).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> data = new ArrayList(Arrays.asList("Abc", "AAd", null, "sample", null));
        Predicate<String> isNull = item -> Objects.nonNull(item);
        data = filterDataOnCondition(data, isNull);
        System.out.println(data);


        System.out.println("Filter with Stream");
        data = new ArrayList(Arrays.asList("Abc", "AAd", null, "sample", null));
        data = filterUsingStream(data, isNull);
        System.out.println(data);


    }
}
