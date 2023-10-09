package com.ctci.basics.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndCollectExample {

    public List<Integer> getEvenNumbers(List<Integer> input){
        if(input == null || input.isEmpty()) return new ArrayList<>();
        return input.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
    }


}
