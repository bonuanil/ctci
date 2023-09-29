package com.ctci.basics.java8.methodreferences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertArrayListToMap {

    public static void main(String[] args) {
        List<String> colorBalls = new ArrayList<>();

        colorBalls.add("RED");
        colorBalls.add("BLUE");
        colorBalls.add("GREEN");
        colorBalls.add("YELLOW");

        HashMap map = colorBalls.stream().collect(Collectors.toMap(Function.identity(), String::toLowerCase,
        (a, b) -> a, HashMap::new));

        System.out.println(map);



    }
}
