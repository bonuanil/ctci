package com.ctci.basics.java8.streams;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilterAndCollectExampleTest {

    @org.junit.jupiter.api.Test
    void getEvenNumbers() {
        List<Integer> integerList = Arrays.asList(new Integer[]{1, 4, 98, 6, 7, 13, 44, 32, 12});
        FilterAndCollectExample test = new FilterAndCollectExample();
        assert (test.getEvenNumbers(integerList).size() == 6);
        assert (test.getEvenNumbers(null).size() == 0);
    }
}